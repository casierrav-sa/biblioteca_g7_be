package com.misiontic.usergioarboleda.BibliotecaG7.repositories;


import com.misiontic.usergioarboleda.BibliotecaG7.models.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookCRUDRepository extends CrudRepository<Book, Integer>{

    @Query(value="SELECT * FROM book WHERE year>=? AND year<=?", nativeQuery=true)
    public List<Book> findBooksByDates(int startYear, int endYear);
}