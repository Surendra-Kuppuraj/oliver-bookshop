package com.oliver.constants;

/**
 * @author Surendra
 * 
 */
public enum AuthorNavigation {

	BOOK("books", "/author/book/index.xhtml"),
	AUDIO("audio","/author/audio/index.xhtml"),
	VIDEO("video","/author/video/index.xhtml"),
	NEWSPAPERE("newspapers", "/author/newspaper/index.xhtml"),
	MAGAZINE("magazine", "/author/magazine/index.xhtml"),
	OTHERS("others", "/author/others/categorie-index.xhtml");

	private String linkName;
	private String linkURI;

	private AuthorNavigation(String linkName, String linkURI) {
		this.linkName = linkName;
		this.linkURI = linkURI;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkURI() {
		return linkURI;
	}

	public void setLinkURI(String linkURI) {
		this.linkURI = linkURI;
	}

}
