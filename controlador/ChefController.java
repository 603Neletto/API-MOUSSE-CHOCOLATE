package com.example.demo.controlador;
import com.example.demo.modelo.ChefMC;
import com.example.demo.service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chefs") // http://localhost:8080/api/chefs
public class ChefController {

    @Autowired
    private ChefService chefService;

    @GetMapping
    public List<ChefMC> obtenerTodos() {
        return chefService.listarTodos();
    }
    //busqueda por ID
    public ChefMC busquedaID(@PathVariable Long id){
        return chefService.busquedaID(id);
    }

    @PostMapping
    public ChefMC crear(@RequestBody ChefMC chef) {
        return chefService.guardar(chef);
    }
    //acyualizar el chef creado
    @PutMapping("/{id}")
    public ChefMC actualizar(@PathVariable Long id, @RequestBody ChefMC chef) {
        return chefService.actualizar(id, chef);
    }
    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
        chefService.borrar(id);
}
}