package hn.unah.lenguajes.restaurante.restaurante.Services;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Comida;
import hn.unah.lenguajes.restaurante.restaurante.Entities.Ingrediente;

public interface ComidaService {
    
    public Comida crearComida(Comida comida);

    public Comida buscarComida(long idComida);

    public Comida eliminarComida(long idComida);

    public Ingrediente asignarAInventario(long idingrediente, long idComida);
}
