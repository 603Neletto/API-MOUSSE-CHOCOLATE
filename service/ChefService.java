package com.example.demo.service;

import com.example.demo.modelo.ChefMC;
import com.example.demo.repositorio.Chefrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ChefService {

    @Autowired
    private Chefrepo chefRepository; 

    public List<ChefMC> listarTodos() {
        return chefRepository.findAll(); // findAll es de Spring
    }

    public ChefMC guardar(ChefMC chef) {
        return chefRepository.save(chef); 
    }

    public ChefMC busquedaID(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'busquedaID'");
    }

    public ChefMC actualizar(Long id, ChefMC chef) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    public void borrar(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrar'");
    }
}