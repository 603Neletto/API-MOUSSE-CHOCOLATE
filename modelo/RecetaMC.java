package com.example.demo.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "receta_mc")
public class RecetaMC {

    // Identificador único y clave primaria
    @Id
 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  
    private Double cantidadChocolateGramos;
    private int cantidadHuevos;
    private Double cantidadMantequillaGramos;
    private Double cantidadAzucarGramos;

   
    public RecetaMC() {
    }


    public RecetaMC(Double cantidadChocolateGramos, Integer cantidadHuevos, Double cantidadMantequillaGramos, Double cantidadAzucarGramos) {
        this.cantidadChocolateGramos = cantidadChocolateGramos;
        this.cantidadHuevos = cantidadHuevos;
        this.cantidadMantequillaGramos = cantidadMantequillaGramos;
        this.cantidadAzucarGramos = cantidadAzucarGramos;
    }

    // --- GETTERS Y SETTERS ---
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCantidadChocolateGramos() {
        return cantidadChocolateGramos;
    }

    public void setCantidadChocolateGramos(Double cantidadChocolateGramos) {
        this.cantidadChocolateGramos = cantidadChocolateGramos;
    }

    public Integer getCantidadHuevos() {
        return cantidadHuevos;
    }

    public void setCantidadHuevos(Integer cantidadHuevos) {
        this.cantidadHuevos = cantidadHuevos;
    }

    public Double getCantidadMantequillaGramos() {
        return cantidadMantequillaGramos;
    }

    public void setCantidadMantequillaGramos(Double cantidadMantequillaGramos) {
        this.cantidadMantequillaGramos = cantidadMantequillaGramos;
    }

    public Double getCantidadAzucarGramos() {
        return cantidadAzucarGramos;
    }

    public void setCantidadAzucarGramos(Double cantidadAzucarGramos) {
        this.cantidadAzucarGramos = cantidadAzucarGramos;
    }
}
    
