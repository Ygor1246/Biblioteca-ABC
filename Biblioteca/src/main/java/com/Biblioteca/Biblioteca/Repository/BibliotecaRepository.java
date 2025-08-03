package com.Biblioteca.Biblioteca.Repository;

import com.Biblioteca.Biblioteca.Model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer> {
    List<Biblioteca> findAll();
}
