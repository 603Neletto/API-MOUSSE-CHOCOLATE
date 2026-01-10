package com.example.demo.controlador;
import com.example.demo.modelo.RecetaMC; 
import com.example.demo.service.recetaService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/recetas-mousse") //http://localhost:8080/api/recetas-mousse
public class Controladormcc {
private final recetaService recetaMCService;

    @Autowired
    public Controladormcc(recetaService recetaMCService) {
        this.recetaMCService = recetaMCService;
    }
    
    // URL: POST /api/recetas-mousse
    @PostMapping
    public ResponseEntity<RecetaMC> createReceta(@RequestBody RecetaMC receta) {
        RecetaMC nuevaReceta = recetaMCService.save(receta);
        return 
        new ResponseEntity<>(nuevaReceta, HttpStatus.CREATED);
    }
    //post para guarda todas entidades de una vez
    @PostMapping ("/lote-receta-Mousse")
    public ResponseEntity<List<RecetaMC>> createRecetasEnLote(@RequestBody List<RecetaMC> receta){
        List<RecetaMC> nuevasRecetas = recetaMCService.saveAll(receta);
        
        return new ResponseEntity<>(nuevasRecetas, HttpStatus.CREATED);
    }

 
    // URL: GET /api/recetas-mousse
    @GetMapping
    public List<RecetaMC> getAllRecetas() {
        return recetaMCService.findAll();
    }
  
}
    
