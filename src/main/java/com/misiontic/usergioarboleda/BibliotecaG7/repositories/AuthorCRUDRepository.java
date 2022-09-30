package com.misiontic.usergioarboleda.BibliotecaG7.repositories;

import com.misiontic.usergioarboleda.BibliotecaG7.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorCRUDRepository extends CrudRepository<Author, Integer> {
}