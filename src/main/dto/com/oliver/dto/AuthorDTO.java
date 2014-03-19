/**
 * 
 */
package com.oliver.dto;

import java.util.Collection;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.oliver.entities.Book;
import org.oliver.entities.Name;

/**
 * @author Surendra
 *
 */
public class AuthorDTO {
    private Integer authorsPk;

    private String biographie;
   
    private Name name;

    Collection<Book> books;

    public Integer getAuthorsPk() {
        return authorsPk;
    }

    public void setAuthorsPk(Integer authorsPk) {
        this.authorsPk = authorsPk;
    }

    public String getBiographie() {
        return biographie;
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
    
    

}
