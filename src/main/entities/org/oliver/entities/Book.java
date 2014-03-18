package org.oliver.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the BOOKS database table.
 * 
 */
@Entity
@Table(name = "BOOKS")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "BOOKS_PK")
    private Integer booksPk;

    private String description;

    private String isbn;

    private String language;

    private int pages;

    private String title;

    private int year;

    // ===========================================
    // Overloaded Constructor
    // ===========================================

    public Book() {
    }

    public Book(Integer booksPk) {
	this.booksPk = booksPk;
    }

    public Book(Integer booksPk, String description, String isbn,
	    String language, int pages, String title, int year) {
	this.booksPk = booksPk;
	this.description = description;
	this.isbn = isbn;
	this.language = language;
	this.pages = pages;
	this.title = title;
	this.year = year;
    }

    // ===========================================
    // Property accessor methods
    // ===========================================

    public Integer getBooksPk() {
	return booksPk;
    }

    public void setBooksPk(Integer booksPk) {
	this.booksPk = booksPk;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getIsbn() {
	return isbn;
    }

    public void setIsbn(String isbn) {
	this.isbn = isbn;
    }

    public String getLanguage() {
	return language;
    }

    public void setLanguage(String language) {
	this.language = language;
    }

    public int getPages() {
	return pages;
    }

    public void setPages(int pages) {
	this.pages = pages;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public int getYear() {
	return year;
    }

    public void setYear(int year) {
	this.year = year;
    }

    // ===========================================
    // Overriding methods
    // ===========================================

    @Override
    public int hashCode() {
	int hash = 0;
	hash += (booksPk != null ? booksPk.hashCode() : 0);
	return hash;
    }

    @Override
    public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are
	// not set
	if (!(object instanceof Book)) {
	    return false;
	}
	Book other = (Book) object;
	if ((this.booksPk == null && other.booksPk != null)
		|| (this.booksPk != null && !this.booksPk.equals(other.booksPk))) {
	    return false;
	}
	return true;
    }

    /**
     * Returns the object as a CSV string
     */
    @Override
    public String toString() {
	StringBuffer sb = new StringBuffer();
	sb.append(booksPk);
	sb.append(",");
	sb.append(description);
	sb.append(",");
	sb.append(isbn);
	sb.append(",");
	sb.append(language);
	sb.append(",");
	sb.append(pages);
	sb.append(",");
	sb.append(title);
	sb.append(",");
	sb.append(year);
	return sb.toString();
    }

}