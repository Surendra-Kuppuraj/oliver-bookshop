/**
 * 
 */
package com.oliver.dto;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;

import org.oliver.entities.Author;

/**
 * @author Surendra
 * 
 */
public class NameDTO {

    private Integer namesPk;

    private String firstName;

    private String lastName;

    private Collection<Author> authors;

    // ===========================================
    // Property accessor methods
    // ===========================================

    public Integer getNamesPk() {
	return namesPk;
    }

    public void setNamesPk(Integer namesPk) {
	this.namesPk = namesPk;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public Collection<Author> getAuthors() {
	return authors;
    }

    public void setAuthors(Collection<Author> authors) {
	this.authors = authors;
    }

}
