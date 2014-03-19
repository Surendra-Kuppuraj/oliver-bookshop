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
    /**
     * @return the namesPk
     */
    public Integer getNamesPk() {
	return namesPk;
    }

    /**
     * @param namesPk
     *            the namesPk to set
     */
    public void setNamesPk(Integer namesPk) {
	this.namesPk = namesPk;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
	return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
	return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    /**
     * @return the authors
     */
    public Collection<Author> getAuthors() {
	return authors;
    }

    /**
     * @param authors
     *            the authors to set
     */
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