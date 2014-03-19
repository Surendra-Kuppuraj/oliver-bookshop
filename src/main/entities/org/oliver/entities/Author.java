package org.oliver.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the AUTHORS database table.
 * 
 */
@Entity
@Table(name = "AUTHORS")
public class Author implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "AUTHORS_PK")
    private Integer authorsPk;

    private String biographie;

    @ManyToOne(optional = false)
    @JoinColumn(name = "NAMES_AUTHORS_FK", referencedColumnName = "NAMES_PK")
    private Name name;

    @ManyToMany
    @JoinTable(name = "AUTHORS_BOOKS", joinColumns = @JoinColumn(name = "AB_AUTHORS_FK", referencedColumnName = "AUTHORS_PK"), inverseJoinColumns = @JoinColumn(name = "AB_BOOKS_FK", referencedColumnName = "BOOKS_PK"))
    Collection<Book> books;

    // ===========================================
    // Overloaded Constructor
    // ===========================================
    public Author() {
    }

    public Author(Integer authorsPk) {
	this.authorsPk = authorsPk;
    }

    public Author(Integer authorsPk, String biographie) {
	this.authorsPk = authorsPk;
	this.biographie = biographie;
    }

    // ===========================================
    // Property accessor methods
    // ===========================================

    public String getBiographie() {
	return biographie;
    }

    public Integer getAuthorsPk() {
	return authorsPk;
    }

    public void setAuthorsPk(Integer authorsPk) {
	this.authorsPk = authorsPk;
    }

    public void setBiographie(String biographie) {
	this.biographie = biographie;
    }

    public Name getName() {
	return name;
    }

    public void setName(Name name) {
	this.name = name;
    }

    public Collection<Book> getBooks() {
	return books;
    }

    public void setBooks(Collection<Book> books) {
	this.books = books;
    }

    // ===========================================
    // Overriding methods
    // ===========================================

    @Override
    public int hashCode() {
	int hash = 0;
	hash += (authorsPk != null ? authorsPk.hashCode() : 0);
	return hash;
    }

    @Override
    public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are
	// not set
	if (!(object instanceof Author)) {
	    return false;
	}
	Author other = (Author) object;
	if ((this.authorsPk == null && other.authorsPk != null)
		|| (this.authorsPk != null && !this.authorsPk
			.equals(other.authorsPk))) {
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
	sb.append(biographie);
	sb.append(",");
	sb.append(name);
	return sb.toString();
    }

}