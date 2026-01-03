package com.example.demo.service;

import com.example.demo.modelo.ChefMC;
import com.example.demo.modelo.UtensilioMC;
import com.example.demo.repositorio.Chefrepo;
import com.example.demo.repositorio.Recetarepo;
import com.example.demo.repositorio.UtensiliosRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtensilioService {
    @Autowired
    private UtensiliosRepo utensiliosRepository;

    public List<UtensilioMC> listarTodos() {
        return utensiliosRepository.findAll();
    }

    public UtensilioMC guardar(UtensilioMC utensilio ) {
        return utensiliosRepository.save(utensilio);
    }
    
    public void eliminar(Long id) {
       utensiliosRepository.deleteById(id);
    }
}
