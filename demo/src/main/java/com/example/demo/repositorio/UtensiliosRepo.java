package com.example.demo.repositorio;

import com.example.demo.modelo.ChefMC;
import com.example.demo.modelo.UtensilioMC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtensiliosRepo extends JpaRepository<UtensilioMC, Long> {

    UtensilioMC save(UtensilioMC utensilio);

   
}