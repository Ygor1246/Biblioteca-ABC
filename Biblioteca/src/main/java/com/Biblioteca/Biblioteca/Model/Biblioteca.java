package com.Biblioteca.Biblioteca.Model;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
@Entity


public class Biblioteca {

@Id
@GeneratedValeu()
   private List<Biblioteca> biblioteca;


    private Integer id;
    private String nome;
    private String telefone;



}
