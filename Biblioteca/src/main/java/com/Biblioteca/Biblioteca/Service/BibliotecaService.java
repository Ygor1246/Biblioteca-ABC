package com.Biblioteca.Biblioteca.Service;

import com.Biblioteca.Biblioteca.Model.Biblioteca;
import com.Biblioteca.Biblioteca.Repository.BibliotecaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaService {

    private final BibliotecaRepository bibliotecaRepository;

    public BibliotecaService(BibliotecaRepository repository) {
       this.bibliotecaRepository = repository;

    }

    public List<Biblioteca> findAll() {
        return bibliotecaRepository.findAll();
    }
}
