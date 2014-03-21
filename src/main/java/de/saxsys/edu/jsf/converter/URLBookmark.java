package de.saxsys.edu.jsf.converter;

public class URLBookmark {

	private String fullUrl;

	public URLBookmark(String fullUrl) {
		this.setFullUrl(fullUrl);
	}

	public String getFullUrl() {
		return fullUrl;
	}

	public void setFullUrl(String fullUrl) {
		this.fullUrl = fullUrl;
	}

	@Override
	public String toString() {
		return fullUrl;
	}
	
}
