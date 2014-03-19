package org.oliver.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the "NAMES" database table.
 * 
 */
@Entity
@Table(name = "NAMES")
public class Name implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NAMES_PK")
    private Integer namesPk;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "name")
    private Collection<Author> authors;

    // ===========================================
    // Overloaded Constructor
    // ===========================================
    public Name() {
    }

    public Name(Integer namesPk) {
	this.namesPk = namesPk;
    }

    public Name(Integer namesPk, String firstName, String lastName) {
	this.namesPk = namesPk;
	this.firstName = firstName;
	this.lastName = lastName;
    }

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

    // ===========================================
    // Overriding methods
    // ===========================================

    @Override
    public int hashCode() {
	int hash = 0;
	hash += (namesPk != null ? namesPk.hashCode() : 0);
	return hash;
    }

    @Override
    public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are
	// not set
	if (!(object instanceof Name)) {
	    return false;
	}
	Name other = (Name) object;
	if ((this.namesPk == null && other.namesPk != null)
		|| (this.namesPk != null && !this.namesPk.equals(other.namesPk))) {
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
	sb.append(namesPk);
	sb.append(",");
	sb.append(firstName);
	sb.append(",");
	sb.append(lastName);
	return sb.toString();
    }

}