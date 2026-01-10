package com.example.demo.repositorio;


import com.example.demo.modelo.ChefMC;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Chefrepo extends JpaRepository<ChefMC, Long> {

    ChefMC save(ChefMC chef);

    List<ChefMC> findByNombreAndEspecialidad(String nombre, String especialidad);

    boolean existsByNombre(String nombre);
   
}