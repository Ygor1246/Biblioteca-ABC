package com.Biblioteca.Biblioteca.Model;


import jdk.jfr.DataAmount;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.lang.reflect.GenericArrayType;
import java.util.List;

@Data
@Entity

public class Biblioteca {
//     private List<Biblioteca> bibliotecas;
 @Id
 @GeneratedValue(strate = GenericArrayType.IDENTITY)
    private Integer id;
    private String nome;
    private String telefone;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
  public String getTelefone() {
        return telefone;
  }
  public void setTelefone(String telefone) {
        this.telefone = telefone;
  }

}
