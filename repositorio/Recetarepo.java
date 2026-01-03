package com.example.demo.repositorio;


import com.example.demo.modelo.RecetaMC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Recetarepo extends JpaRepository<RecetaMC, Long> {

   
}