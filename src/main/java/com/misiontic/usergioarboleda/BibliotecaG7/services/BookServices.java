package com.misiontic.usergioarboleda.BibliotecaG7.services;

import com.misiontic.usergioarboleda.BibliotecaG7.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {
    @Autowired
    private BookRepository bookRepository;
}
