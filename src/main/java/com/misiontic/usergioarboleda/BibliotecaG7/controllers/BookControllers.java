package com.misiontic.usergioarboleda.BibliotecaG7.controllers;

import com.misiontic.usergioarboleda.BibliotecaG7.models.Book;
import com.misiontic.usergioarboleda.BibliotecaG7.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookControllers {
    @Autowired
    private BookServices bookServices;

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return bookServices.getAllBooks();
    }

    @GetMapping("/years/{start}/{end}")
    public List<Book> getAllBooksByDates(@PathVariable("start") int start, @PathVariable("end") int end){
        return bookServices.getBookByDates(start, end);
    }

    public Optional<Book> getBook(int isbn){
        return bookServices.getBook(isbn);
    }

    public Book insertBook(Book book){
        return bookServices.insertBook(book);
    }

    public Book updateBook(Book book){
        return bookServices.updateBook(book);
    }

    public Boolean deleteBook(int isbn){
        return bookServices.deleteBook(isbn);
    }
}