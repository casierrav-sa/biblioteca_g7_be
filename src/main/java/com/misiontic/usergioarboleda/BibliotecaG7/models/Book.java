package com.misiontic.usergioarboleda.BibliotecaG7.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="book")
public class Book implements Serializable  {
    //Attributes
    @Id
    private Integer isbn;
    private String title;
    private String register_date;
    private Integer year;

    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties("books")
    private Editorial editorial_fk;

    @ManyToMany
    @JoinTable(
            name="book_author",
            joinColumns        = @JoinColumn(name="isbn"), //PK Book
            inverseJoinColumns = @JoinColumn(name="code") //PK Author
    )
    private Set<Author> authors;


    // ============== Getters & Setters ============== //

    /**
     *
     * @return
     */
    public Integer getIsbn() {
        return isbn;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public String getRegister_date() {
        return register_date;
    }

    /**
     *
     * @param register_date
     */
    public void setRegister_date(String register_date) {
        this.register_date = register_date;
    }

    /**
     *
     * @return
     */
    public Integer getYear() {
        return year;
    }

    /**
     *
     * @param year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     *
     * @return
     */
    public Editorial getEditorial_fk() {
        return editorial_fk;
    }

    /**
     *
     * @param editorial_fk
     */
    public void setEditorial_fk(Editorial editorial_fk) {
        this.editorial_fk = editorial_fk;
    }

    /**
     *
     * @return
     */
    public Set<Author> getAuthors() {
        return authors;
    }

    /**
     *
     * @param authors
     */
    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}