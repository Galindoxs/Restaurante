package hn.unah.lenguajes.restaurante.restaurante.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Cliente;
import hn.unah.lenguajes.restaurante.restaurante.Entities.Usuario;
import hn.unah.lenguajes.restaurante.restaurante.Repositories.ClienteRepository;
import hn.unah.lenguajes.restaurante.restaurante.Repositories.UsuarioRepository;
import hn.unah.lenguajes.restaurante.restaurante.Services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        Usuario usuario = new Usuario();
        usuario.setNombreusuario(cliente.getUsuario().getNombreusuario());
        usuario.setContraseniausuario(cliente.getUsuario().getContraseniausuario());

        cliente.setUsuario(usuarioRepository.save(usuario));

        return clienteRepository.save(cliente);    
    }

    @Override
    public Cliente buscarClientePorUsuario(String nombreUsuario, String contra) {
        if(usuarioRepository.existsById(nombreUsuario)){
            Usuario usuarioLogin = usuarioRepository.findById(nombreUsuario).get();
            if(usuarioLogin.getContraseniausuario() == contra){
                return usuarioLogin.getCliente();
            } 
        }
       return null;
    }
    
}
