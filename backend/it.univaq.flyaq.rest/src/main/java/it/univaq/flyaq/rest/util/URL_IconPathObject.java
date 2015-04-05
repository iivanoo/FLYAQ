package it.univaq.flyaq.rest.util;

import java.net.URL;

public class URL_IconPathObject {

	URL url;
	String iconPath;
	
	public URL_IconPathObject (URL url, String iconPath) {
		this.url = url;
		this.iconPath = iconPath;
	}

	public URL getUrl() {
		return url;
	}

	public String getIconPath() {
		return iconPath;
	}
}
