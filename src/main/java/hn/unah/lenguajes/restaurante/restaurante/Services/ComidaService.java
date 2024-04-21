package hn.unah.lenguajes.restaurante.restaurante.Services;

import java.util.List;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Comida;

public interface ComidaService {
    
    public Comida crearComida(Comida comida);

    public Comida buscarComida(long idComida);

    public List<Comida> mostrarComida();

    public Comida eliminarComida(long idComida);

   
}
