package it.univaq.flyaq.frontend;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

public class GZIPResponseStream extends ServletOutputStream {

	private ByteArrayOutputStream byteStream = null;

	private GZIPOutputStream gzipStream = null;

	private boolean closed = false;

	private HttpServletResponse response = null;

	private ServletOutputStream servletStream = null;

	public GZIPResponseStream(HttpServletResponse response) throws IOException {
		super();
		closed = false;
		this.response = response;
		this.servletStream = response.getOutputStream();
		byteStream = new ByteArrayOutputStream();
		gzipStream = new GZIPOutputStream(byteStream);
	}

	public void close() throws IOException {
		if (closed) {
			throw new IOException("This output stream has already been closed");
		}
		gzipStream.finish();

		byte[] bytes = byteStream.toByteArray();

		response.setContentLength(bytes.length);
		response.addHeader("Content-Encoding", "gzip");
		servletStream.write(bytes);
		servletStream.flush();
		servletStream.close();
		closed = true;
	}

	public void flush() throws IOException {
		if (closed) {
			throw new IOException("Cannot flush a closed output stream");
		}
		gzipStream.flush();
	}

	public void write(int b) throws IOException {
		if (closed) {
			throw new IOException("Cannot write to a closed output stream");
		}
		gzipStream.write((byte) b);
	}

	public void write(byte b[]) throws IOException {
		write(b, 0, b.length);
	}

	public void write(byte b[], int off, int len) throws IOException {
		if (closed) {
			throw new IOException("Cannot write to a closed output stream");
		}
		gzipStream.write(b, off, len);
	}

}