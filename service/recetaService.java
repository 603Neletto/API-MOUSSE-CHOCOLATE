package com.example.demo.service;

import com.example.demo.modelo.RecetaMC;
import com.example.demo.repositorio.Recetarepo; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class recetaService {

    private final Recetarepo recetaMCRepository;

    @Autowired
    public recetaService(Recetarepo recetaMCRepository) {
        this.recetaMCRepository = recetaMCRepository;
    }

    public RecetaMC save(RecetaMC receta) {
        return recetaMCRepository.save(receta);
    }


    public List<RecetaMC> findAll() {
        return recetaMCRepository.findAll();
    }

    // READ by ID
    public Optional<RecetaMC> findById(Long id) {
        return recetaMCRepository.findById(id);
    }

  
    public void deleteById(Long id) {
        recetaMCRepository.deleteById(id);
    }
}