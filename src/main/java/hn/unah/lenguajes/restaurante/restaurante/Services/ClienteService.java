package hn.unah.lenguajes.restaurante.restaurante.Services;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public Cliente buscarClientePorCorreo(String correo);
    
}
