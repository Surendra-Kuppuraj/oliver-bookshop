/**
 * 
 */
package com.oliver.dto;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

import org.oliver.entities.Author;
import org.oliver.entities.Category;

/**
 * @author Surendra
 * 
 */
public class BookDTO {

    private Integer booksPk;

    private String description;

    private String isbn;

    private String language;

    private int pages;

    private String title;

    private int year;

    private Collection<Author> authors;

    private Collection<Category> categories;

    // ===========================================
    // Property accessor methods
    // ===========================================

    public String getDescription() {
	return description;
    }

    public Integer getBooksPk() {
	return booksPk;
    }

    public void setBooksPk(Integer booksPk) {
	this.booksPk = booksPk;
    }

    public Collection<Author> getAuthors() {
	return authors;
    }

    public void setAuthors(Collection<Author> authors) {
	this.authors = authors;
    }

    public Collection<Category> getCategories() {
	return categories;
    }

    public void setCategories(Collection<Category> categories) {
	this.categories = categories;
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

}
