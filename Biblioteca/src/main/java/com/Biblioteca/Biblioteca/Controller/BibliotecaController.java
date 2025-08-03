package com.Biblioteca.Biblioteca.Controller;


import com.Biblioteca.Biblioteca.Model.Biblioteca;
import com.Biblioteca.Biblioteca.Service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import
@RestController
@RequestMapping("/Biblioteca")
public class BibliotecaController {


    @Autowired
    private final BibliotecaService bibliotecaService;

    public BibliotecaController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

@GetMapping("/findAll")
    public ResponseEntity<List<Biblioteca>> findAll() {
        try {
            var  result = bibliotecaService.findAll();
        }catch (Exception e) {

        }
        }

}
