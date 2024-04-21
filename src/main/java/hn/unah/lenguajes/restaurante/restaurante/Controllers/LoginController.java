package hn.unah.lenguajes.restaurante.restaurante.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Cliente;
import hn.unah.lenguajes.restaurante.restaurante.Services.Impl.ClienteServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("api")
public class LoginController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;
    
    @GetMapping("/login")
    public Cliente buscarClientePorUsuario(@RequestParam String nombreusuario, @RequestParam String contraseniausuario) {
        return clienteServiceImpl.buscarClientePorUsuario(nombreusuario, contraseniausuario);
    }
    
}
