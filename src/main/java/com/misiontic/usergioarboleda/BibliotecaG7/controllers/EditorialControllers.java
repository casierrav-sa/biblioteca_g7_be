package com.misiontic.usergioarboleda.BibliotecaG7.controllers;

import com.misiontic.usergioarboleda.BibliotecaG7.models.Editorial;
import com.misiontic.usergioarboleda.BibliotecaG7.services.EditorialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/editorial")
public class EditorialControllers {
    @Autowired
    private EditorialServices editorialServices;

    @GetMapping("/all")
    public List<Editorial> getAllEditorials(){
        return editorialServices.getAllEditorials();
    }

    @GetMapping("/{id}")
    public Optional<Editorial> getEditorial(@PathVariable("id") int id){
        return editorialServices.getEditorial(id);
    }

    @PostMapping("/insert")
    public Editorial insertEditorial(@RequestBody Editorial editorial){
        return editorialServices.insertEditorial(editorial);
    }

    @PutMapping("/update")
    public Editorial updateEditorial(@RequestBody Editorial editorial){
        return editorialServices.updateEditorial(editorial);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteEditorial(@PathVariable("id") int id){
        return editorialServices.deleteEditorial(id);
    }
}
