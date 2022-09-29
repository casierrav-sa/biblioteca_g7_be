package com.misiontic.usergioarboleda.BibliotecaG7.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name="editorial")
public class Editorial implements Serializable {
    //Attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String country;

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
}
