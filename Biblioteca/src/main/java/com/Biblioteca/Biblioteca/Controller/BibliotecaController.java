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
    private BibliotecaService bibliotecaService;


@GetMapping("/findAll")
    public ResponseEntity<List<Biblioteca>> lista() {
        try {


            List<Biblioteca> lista= this.bibliotecaService.lista();

            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
  return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }


}
