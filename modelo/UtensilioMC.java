package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utensilio_mc")
public class UtensilioMC {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String horno;
    private String espatula;
    private String trituradora;
 

    public UtensilioMC(){

    }

    public UtensilioMC(Long id, String horno, String espatula, String trituradora) {
        this.id = id;
        this.horno = horno;
        this.espatula = espatula;
        this.trituradora = trituradora;
    }
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHorno() {
        return horno;
    }

    public void setHorno(String horno) {
        this.horno = horno;
    }

    public String getEspatula() {
        return espatula;
    }

    public void setEspatula(String espatula) {
        this.espatula = espatula;
    }

    public String getTrituradora() {
        return trituradora;
    }

    public void setTrituradora(String trituradora) {
        this.trituradora = trituradora;
    }

    
}
