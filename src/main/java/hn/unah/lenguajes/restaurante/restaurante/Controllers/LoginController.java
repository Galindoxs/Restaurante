package hn.unah.lenguajes.restaurante.restaurante.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Cliente;
import hn.unah.lenguajes.restaurante.restaurante.Services.Impl.ClienteServiceImpl;
import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("api")
public class LoginController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;
    
    @Operation(summary = "Busca si el String nombreusuario, String contraseniausuario existen y coinciden en la base de datos")
    @GetMapping("/login")
    public Cliente buscarClientePorUsuario(@RequestParam String nombreusuario, @RequestParam String contraseniausuario) {
        return clienteServiceImpl.buscarClientePorUsuario(nombreusuario, contraseniausuario);
    }
    
}
