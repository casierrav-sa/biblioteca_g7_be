package com.misiontic.usergioarboleda.BibliotecaG7.services;

import com.misiontic.usergioarboleda.BibliotecaG7.models.Author;
import com.misiontic.usergioarboleda.BibliotecaG7.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServices {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAll(){
        return authorRepository.getAll();
    }

    public Optional<Author> getAuthor(int code){
        return authorRepository.getAuthor(code);
    }

    public Author insert(Author author){
        if(author.getCode() != null){
            Optional<Author> temp = authorRepository.getAuthor( author.getCode() );
            if(temp.isEmpty())
                return authorRepository.save(author);
            else
                return author;
        }
        else
            return author;
    }

    public Author update(Author author){
        if(author.getCode() != null){
            Optional<Author> temp = authorRepository.getAuthor( author.getCode() );
            if( !temp.isEmpty() ){
                if(author.getName() != null)
                    temp.get().setName( author.getName() );

                if(author.getLastname() != null)
                    temp.get().setLastname( author.getLastname() );

                return authorRepository.save(temp.get());
            }
            else
                return author;
        }
        else
            return author;
    }

    public void delete(Author author){

    }
}
