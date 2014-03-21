package de.saxsys.edu.jsf.converter;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class URLBean implements Serializable {

	private static final long serialVersionUID = 7057648983175763850L;

	private String bookmarkUrl;

	public String getBookmarkUrl() {
		return bookmarkUrl;
	}

	public void setBookmarkUrl(String bookmarkUrl) {
		this.bookmarkUrl = bookmarkUrl;
	}
	
	
	
}
