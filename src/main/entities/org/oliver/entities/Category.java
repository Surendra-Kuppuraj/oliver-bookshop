package org.oliver.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the CATEGORIES database table.
 * 
 */
@Entity
@Table(name = "CATEGORIES")
@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CATEGORIES_PK")
    private Integer categoriesPk;

    @Column(name = "CATEGORIES_NAME")
    private String categoriesName;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @ManyToMany
    @JoinTable(name = "CATEGORIES_BOOKS", joinColumns = @JoinColumn(name = "CB_CATEGORIES_FK", referencedColumnName = "CATEGORIES_PK"), inverseJoinColumns = @JoinColumn(name = "CB_BOOKS_FK", referencedColumnName = "BOOKS_PK"))
    private Collection<Book> books;

    // ===========================================
    // Overloaded Constructor
    // ===========================================
    public Category() {
    }

    public Category(Integer categoriesPk) {
	this.categoriesPk = categoriesPk;
    }

    public Category(Integer categoriesPk, String categoriesName,
	    Date creationDate, Date modifiedDate) {
	this.categoriesPk = categoriesPk;
	this.categoriesName = categoriesName;
	this.creationDate = creationDate;
	this.modifiedDate = modifiedDate;
    }

    // ===========================================
    // Property accessor methods
    // ===========================================

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

    // ===========================================
    // Overriding methods
    // ===========================================

    @Override
    public int hashCode() {
	int hash = 0;
	hash += (categoriesPk != null ? categoriesPk.hashCode() : 0);
	return hash;
    }

    @Override
    public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are
	// not set
	if (!(object instanceof Category)) {
	    return false;
	}
	Category other = (Category) object;
	if ((this.categoriesPk == null && other.categoriesPk != null)
		|| (this.categoriesPk != null && !this.categoriesPk
			.equals(other.categoriesPk))) {
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
	sb.append(categoriesPk);
	sb.append(",");
	sb.append(categoriesName);
	sb.append(",");
	sb.append(creationDate);
	sb.append(",");
	sb.append(modifiedDate);
	return sb.toString();
    }

}