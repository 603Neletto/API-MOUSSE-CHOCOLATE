package com.example.demo.controlador;

import com.example.demo.modelo.UtensilioMC;
import com.example.demo.service.UtensilioService;
import com.example.demo.modelo.UtensilioMC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utensilios")  // http://localhost:8080/api/utensilios

public class UtensilioController {
    @Autowired
private UtensilioService UtensilioService;

@GetMapping
public List <UtensilioMC>listarTodos(){
    return UtensilioService.listarTodos();
}

@PostMapping
public UtensilioMC crear (@RequestBody UtensilioMC utensilio){
    return UtensilioService.guardar(utensilio);
  }
}

    

