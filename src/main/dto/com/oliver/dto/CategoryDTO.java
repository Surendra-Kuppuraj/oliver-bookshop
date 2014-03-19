/**
 * 
 */
package com.oliver.dto;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.oliver.entities.Book;

/**
 * @author Surendra
 * 
 */
public class CategoryDTO {

    private Integer categoriesPk;
    private String categoriesName;
    private Date creationDate;
    private Date modifiedDate;
    private Collection<Book> books;

    public Integer getCategoriesPk() {
	return categoriesPk;
    }

    public void setCategoriesPk(Integer categoriesPk) {
	this.categoriesPk = categoriesPk;
    }

    public String getCategoriesName() {
	return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
	this.categoriesName = categoriesName;
    }

    public Date getCreationDate() {
	return creationDate;
    }

    public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
    }

    public Date getModifiedDate() {
	return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
    }

    public Collection<Book> getBooks() {
	return books;
    }

    public void setBooks(Collection<Book> books) {
	this.books = books;
    }

}
