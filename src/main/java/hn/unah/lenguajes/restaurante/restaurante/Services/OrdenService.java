package hn.unah.lenguajes.restaurante.restaurante.Services;

import java.util.List;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Orden;

public interface OrdenService {

    public Orden crearOrden(Orden orden);

    public List<Orden> buscarPorCliente(long idcliente);
    
} 
