package hn.unah.lenguajes.restaurante.restaurante.Services;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Ingrediente;

public interface IngredienteService {
    
    public Ingrediente crearInventario(Ingrediente inventario);

    public Ingrediente buscarInventario(long idProducto);

    
}
