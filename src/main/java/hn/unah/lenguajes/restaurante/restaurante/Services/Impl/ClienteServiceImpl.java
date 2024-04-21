package hn.unah.lenguajes.restaurante.restaurante.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Cliente;
import hn.unah.lenguajes.restaurante.restaurante.Repositories.ClienteRepository;
import hn.unah.lenguajes.restaurante.restaurante.Services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);    
    }

    @Override
    public Cliente buscarClientePorCorreo(String correo) {
       return null;
    }
    
}
