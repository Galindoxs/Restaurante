package hn.unah.lenguajes.restaurante.restaurante.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Comida;
import hn.unah.lenguajes.restaurante.restaurante.Entities.Ingrediente;
import hn.unah.lenguajes.restaurante.restaurante.Repositories.ComidaRepository;
import hn.unah.lenguajes.restaurante.restaurante.Repositories.IngredienteRepository;
import hn.unah.lenguajes.restaurante.restaurante.Services.ComidaService;

@Service
public class ComidaServiceImpl implements ComidaService{

    @Autowired
    private ComidaRepository comidaRepository;

    @Autowired
    private IngredienteRepository inventarioRepository;

    @Override
    public Comida crearComida(Comida comida) {
       return comidaRepository.save(comida);
    }

    @Override
    public Comida buscarComida(long idComida) {
       Comida comida = comidaRepository.findById(idComida).get();
       return comida;
    }

    @Override
    public Comida eliminarComida(long idComida) {
        return comidaRepository.findById(idComida).get();
    }

    @Override
    public Ingrediente asignarAInventario(long idproducto, long idComida) {
        if(comidaRepository.existsById(idComida) && inventarioRepository.existsById(idproducto)){

            //Averiguar A quien va qué
            return null;
        }        
        
        return null;
    }
    
}
