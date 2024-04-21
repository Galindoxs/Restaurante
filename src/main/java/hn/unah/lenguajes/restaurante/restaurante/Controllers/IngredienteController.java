package hn.unah.lenguajes.restaurante.restaurante.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Ingrediente;
import hn.unah.lenguajes.restaurante.restaurante.Services.Impl.IngredienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class IngredienteController {
    
    @Autowired
    private IngredienteServiceImpl ingredienteServiceImpl;

    @PostMapping("/ingrediente/crear")
    public Ingrediente crearInventario(@RequestBody Ingrediente ingrediente) {
        return ingredienteServiceImpl.crearInventario(ingrediente);
    }
    
    @GetMapping("/ingrediente/buscar")
    public Ingrediente buscarInventario(@RequestParam long ingrediente) {
        return ingredienteServiceImpl.buscarInventario(ingrediente);
    }
    
}
