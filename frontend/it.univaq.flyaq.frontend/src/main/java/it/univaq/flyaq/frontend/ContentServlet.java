/*
 * Copyright 2004-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.univaq.flyaq.frontend;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Special servlet to load static resources and render the admin HTML pages
 * 
 * @author Jeremy Grelle
 * @author Scott Andrews
 * @author Christopher Frost
 */
public class ContentServlet extends HttpServlet {
	
	private static final Logger log = LoggerFactory.getLogger(ContentServlet.class);

	private static final long serialVersionUID = 1L;

	private static final String HTTP_CONTENT_LENGTH_HEADER = "Content-Length";

	private static final String HTTP_LAST_MODIFIED_HEADER = "Last-Modified";

	private static final String HTTP_EXPIRES_HEADER = "Expires";

	private static final String HTTP_CACHE_CONTROL_HEADER = "Cache-Control";
	
	private static final String PATH_TO_VERSION_FILE = "lib/.version";
	
	private static final String SAMPLE_HOLDER = "<!--@<sample-string@-->";
	
	private String view = "/WEB-INF/sample.html";
	
	private boolean gzipEnabled = true;
	
	private final String version;
	
	private int cacheTimeout = 60; //The number of seconds content should be cached by the client. Zero disables caching, 31556926 is one year.

	private Map<String, String> defaultMimeTypes = new HashMap<String, String>();
	{
		defaultMimeTypes.put(".html",  "text/html");
		defaultMimeTypes.put(".htm",   "text/html");
		defaultMimeTypes.put(".xhtml", "text/html");
	}

	private Set<String> compressedMimeTypes = new HashSet<String>();
	{
		compressedMimeTypes.add("text/.*");
		compressedMimeTypes.add(".*/xhtml.xml");
	}
	
    public ContentServlet() {
        this.version = readServerVersion();
    }
	
	/**
	 * {@inheritDoc}
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		URL resource = getRequestedContentURL(this.view);
		prepareContentResponse(response, resource);
		PrintWriter out = selectOutputStream(request, response);
		try {
			URLConnection resourceConn = resource.openConnection();
			InputStream in = resourceConn.getInputStream();
			try {
				this.parse(in, out);
			} finally {
				in.close();
			}
		} finally {
			out.close();
		}
	}
	
	private void parse(InputStream in, PrintWriter out) {
		Scanner scanner = new Scanner(in);
		String parsedLine;
		while (scanner.hasNextLine()) {
			parsedLine = parseLine(scanner.nextLine());
			if(parsedLine != null && !parsedLine.trim().isEmpty()){
				out.append(parsedLine);
				out.append('\n');
			}
		}
	}

	private String parseLine(String line) {
		if(line.contains(SAMPLE_HOLDER)){
			int offset = line.indexOf(SAMPLE_HOLDER);
			line = String.format("%s%s%s", line.substring(0, offset), this.version, line.substring(offset + SAMPLE_HOLDER.length()));
		}
		return line;
	}
	
	private PrintWriter selectOutputStream(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String acceptEncoding = request.getHeader("Accept-Encoding");
		String mimeType = response.getContentType();
		if (gzipEnabled && 
				acceptEncoding != null && 
				acceptEncoding.indexOf("gzip") > -1 && 
				matchesCompressedMimeTypes(mimeType)) {
			log.debug("Enabling GZIP compression for the current response.");
			return new PrintWriter(new GZIPResponseStream(response));
		} else {
			return response.getWriter();
		}
	}

	private boolean matchesCompressedMimeTypes(String mimeType) {
		for(String compressedMimeType: compressedMimeTypes){
			if(mimeType.matches(compressedMimeType)){
				return true;
			}
		}
		return false;
	}
	
	private void prepareContentResponse(HttpServletResponse response, URL resource) throws IOException {	
		URLConnection resourceConn = resource.openConnection();
		String mimeType = getServletContext().getMimeType(resource.getPath());
		if (mimeType == null) {
			String extension = resource.getPath().substring(resource.getPath().lastIndexOf('.'));
			mimeType = (String) defaultMimeTypes.get(extension);
		}
		response.setContentType(mimeType);
		response.setHeader(HTTP_CONTENT_LENGTH_HEADER, Long.toString(resourceConn.getContentLength()));
		response.setDateHeader(HTTP_LAST_MODIFIED_HEADER, resourceConn.getLastModified());
		if (cacheTimeout > 0) {
			configureCaching(response, cacheTimeout);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected long getLastModified(HttpServletRequest request) {
		String rawRequestPath = request.getPathInfo();
		if (log.isDebugEnabled()) {
			log.debug("Checking last modified of content: " + rawRequestPath);
		}
		URL resource;
		try {
			resource = getRequestedContentURL(rawRequestPath);
		} catch (MalformedURLException e) {
			return -1;
		}
		if (resource == null) {
			return -1;
		}
		try {
			return resource.openConnection().getLastModified();
		} catch (IOException e) {
			return -1;
		}
	}

	private URL getRequestedContentURL(String rawRequestPath) throws MalformedURLException {
		URL resource = getServletContext().getResource(rawRequestPath);
		if (resource == null) {
			if (log.isDebugEnabled()) {
				log.debug("Content not found: " + rawRequestPath);
			}
		}
		return resource;
	}

	/**
	 * Set HTTP headers to allow caching for the given number of seconds.
	 * @param seconds number of seconds into the future that the response should be cacheable for
	 */
	private void configureCaching(HttpServletResponse response, int seconds) {
		response.setDateHeader(HTTP_EXPIRES_HEADER, System.currentTimeMillis() + seconds * 1000L); // HTTP 1.0 header
		response.setHeader(HTTP_CACHE_CONTROL_HEADER, "max-age=" + seconds);// HTTP 1.1 header
	}
	
	private String readServerVersion(){
	    String readVersion;
			File versionFile = new File(PATH_TO_VERSION_FILE);
			Properties versions = new Properties();
			InputStream stream = null;
			try {
				stream = new FileInputStream(versionFile);
				versions.load(stream);
				readVersion = versions.getProperty("virgo.server.version");
				stream.close();
			} catch (IOException e) {
				readVersion = "";
				try {
					if(stream != null){
						stream.close();
					}
				} catch (IOException e1) {
					// no-op
				}
		}
		return readVersion;
	}
}
