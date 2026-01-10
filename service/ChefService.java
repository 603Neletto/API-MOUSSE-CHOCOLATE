package com.example.demo.service;

import com.example.demo.modelo.ChefMC;
import com.example.demo.repositorio.Chefrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
public class ChefService {

    @Autowired
    private Chefrepo chefRepository; 

    //Listar todos
    public List<ChefMC> listarTodos() {
        return chefRepository.findAll();
    }

    // Guardar con validación
    public ChefMC guardar(ChefMC chef) {
        if (chefRepository.existsByNombre(chef.getNombre())) {
            throw new RuntimeException("Error: Ya existe un chef con ese nombre.");
        }
        return chefRepository.save(chef);
    }

    //Guardar varios chefs enn lote,y ademas si hay error en el proceso no se guardara ninguno
    @Transactional 
    public List<ChefMC> guardarEnLote(List<ChefMC> lista) {
        for (ChefMC chef : lista) {
            if (chef.getNombre().equalsIgnoreCase("ERROR")) {
                throw new RuntimeException("Error no se puede guargar ninguno");
            }
            this.guardar(chef);
        }
        return lista;
    }

    //Buscar por ID
    public Optional<ChefMC> busquedaID(Long id) {
        return chefRepository.findById(id);
    }

    // Borrar
    public void borrar(Long id) {
        chefRepository.deleteById(id);
    }

    // Actualizar
    public ChefMC actualizar(Long id, ChefMC chef) {
        chef.setId(id); 
        return chefRepository.save(chef);
    }

    //  Filtro por Nombre y Especialidad
    public List<ChefMC> findByNombreAndEspecialidad(String nombre, String especialidad) {
        return chefRepository.findByNombreAndEspecialidad(nombre, especialidad);
    }
}