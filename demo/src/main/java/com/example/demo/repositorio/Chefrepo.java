package com.example.demo.repositorio;


import com.example.demo.modelo.ChefMC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Chefrepo extends JpaRepository<ChefMC, Long> {

    ChefMC save(ChefMC chef);
   
}