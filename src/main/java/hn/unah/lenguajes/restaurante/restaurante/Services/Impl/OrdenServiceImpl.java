package hn.unah.lenguajes.restaurante.restaurante.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Comida;
import hn.unah.lenguajes.restaurante.restaurante.Entities.Ingrediente;
import hn.unah.lenguajes.restaurante.restaurante.Entities.Orden;
import hn.unah.lenguajes.restaurante.restaurante.Repositories.IngredienteRepository;
import hn.unah.lenguajes.restaurante.restaurante.Repositories.OrdenRepository;
import hn.unah.lenguajes.restaurante.restaurante.Services.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService{

    @Autowired
    private OrdenRepository ordenRepository;

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @Autowired
    private IngredienteServiceImpl ingredienteServiceImpl;

    @Override
    public Orden crearOrden(Orden orden) {
        
        Comida comida = orden.getComida();
        List<Ingrediente> ingredientes = comida.getIngrediente();

        for (Ingrediente ingrediente : ingredientes) {
           Ingrediente ingredienteMod = ingredienteRepository.findById(ingrediente.getIdingrediente()).get();
           ingredienteMod.setCantidad(ingredienteMod.getCantidad()-ingrediente.getCantidad());
            ingredienteRepository.save(ingredienteMod);
            ingredienteServiceImpl.revisarCantidadIngredientes(ingredienteMod); //Revisar la cantidad de ingredientes
        }

        return ordenRepository.save(orden); 
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Orden> buscarPorCliente(long idcliente) {
        return (List<Orden>) ordenRepository.findById(idcliente).get();
    }

   
    
}
