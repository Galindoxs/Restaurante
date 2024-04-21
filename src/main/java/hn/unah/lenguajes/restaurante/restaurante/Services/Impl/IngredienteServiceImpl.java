package hn.unah.lenguajes.restaurante.restaurante.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Ingrediente;
import hn.unah.lenguajes.restaurante.restaurante.Repositories.IngredienteRepository;
import hn.unah.lenguajes.restaurante.restaurante.Services.IngredienteService;

@Service
public class IngredienteServiceImpl implements IngredienteService{

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @Override
    public Ingrediente crearInventario(Ingrediente inventario) {
       return ingredienteRepository.save(inventario);
    }

    @Override
    public Ingrediente buscarInventario(long idProducto) {
       return ingredienteRepository.findById(idProducto).get();
    }
    
}
