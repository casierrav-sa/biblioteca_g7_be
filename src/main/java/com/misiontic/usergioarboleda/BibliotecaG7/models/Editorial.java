package com.misiontic.usergioarboleda.BibliotecaG7.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="editorial")
public class Editorial implements Serializable {
    //Attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String country;

    @OneToMany(cascade={CascadeType.PERSIST}, mappedBy="editorial_fk")
    @JsonIgnoreProperties("editorial_fk")
    private List<Book> books;

    /**
     *
     * @param id
     * @param name
     * @param country
     */
    public Editorial(Integer id, String name, String country) {
        this.id      = id;
        this.name    = name;
        this.country = country;
    }

    // ============== Getters & Setters ============== //
    /**
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     *
     * @param books
     */
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}