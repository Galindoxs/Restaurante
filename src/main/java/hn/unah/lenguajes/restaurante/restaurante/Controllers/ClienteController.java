package hn.unah.lenguajes.restaurante.restaurante.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Cliente;
import hn.unah.lenguajes.restaurante.restaurante.Services.Impl.ClienteServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear/cliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteServiceImpl.crearCliente(cliente);
    }
    
}
