package com.example.demo.modelo;
import jakarta.persistence.*;

@Entity
@Table(name = "chef_mc")
public class ChefMC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String especialidad;
    private int añosExperiencia;

    public ChefMC() {

    }

    public ChefMC(String nombre, String especialidad, int añosExperiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    // Getters y Setters
    public Long getId() {
     return id;
     }
    public void setId(Long id) { 
    this.id = id;
     }
    public String getNombre() { 
    return nombre;
   }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public String getEspecialidad() {
     return especialidad; 
    }
    public void setEspecialidad(String especialidad) {
     this.especialidad = especialidad; 
    }
    public int getAñosExperiencia() { 
    return añosExperiencia; 
    }
    public void setAñosExperiencia(int añosExperiencia) { this.añosExperiencia = añosExperiencia; }
}