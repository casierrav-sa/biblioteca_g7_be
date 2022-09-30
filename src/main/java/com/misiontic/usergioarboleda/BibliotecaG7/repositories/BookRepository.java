package com.misiontic.usergioarboleda.BibliotecaG7.repositories;

import com.misiontic.usergioarboleda.BibliotecaG7.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {
    @Autowired
    private BookCRUDRepository bookCRUDRepository;

    public List<Book> getAll(){
        return (List<Book>) bookCRUDRepository.findAll();
    }

    /**
     *
     * @param start
     * @param end
     * @return
     */
    public List<Book> getBooksByDates(String start, String end){
        return bookCRUDRepository.findBooksByDates(start, end);
    }

    /**
     *
     * @param isbn
     * @return
     */
    public Optional<Book> getBook(int isbn){
        return bookCRUDRepository.findById(isbn);
    }

    /**
     *
     * @param book
     * @return
     */
    public Book save(Book book){
        return bookCRUDRepository.save(book);
    }

    /**
     *
     * @param book
     */
    public void delete(Book book){
        bookCRUDRepository.delete(book);
    }
}