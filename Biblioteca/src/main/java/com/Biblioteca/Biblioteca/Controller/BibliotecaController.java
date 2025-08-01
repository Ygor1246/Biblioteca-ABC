package com.Biblioteca.Biblioteca.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Biblioteca.Biblioteca.Model.Biblioteca;
//import
@RestController
@RequestMapping("/Biblioteca")
public class BibliotecaController {

    public ResponseEntity<Biblioteca> lista(Biblioteca biblioteca) {
        try {

            return ResponseEntity.ok(biblioteca);
        }catch (Exception e){

        }
    }

}
