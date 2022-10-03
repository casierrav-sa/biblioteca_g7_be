package com.misiontic.usergioarboleda.BibliotecaG7.controllers;

import com.misiontic.usergioarboleda.BibliotecaG7.models.Author;
import com.misiontic.usergioarboleda.BibliotecaG7.services.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorControllers {
    @Autowired
    private AuthorServices authorServices;

    @GetMapping("/all")
    public List<Author> getAllAuthors(){
        return authorServices.getAllAuthors();
    }

    @GetMapping("/{code}")
    public Optional<Author> getAuthor(@PathVariable("code") int code){
        return authorServices.getAuthor(code);
    }

    @PostMapping("/insert")
    public Author insertAuthor(@RequestBody Author author){
        return authorServices.insertAuthor(author);
    }

    @PutMapping("/update")
    public Author updateAuthor(@RequestBody Author author){
        return authorServices.updateAuthor(author);
    }

    @DeleteMapping("/delete/{code}")
    public Boolean deleteAuthor(@PathVariable("code") int code){
        return authorServices.deleteAuthor(code);
    }
}
