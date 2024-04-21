package hn.unah.lenguajes.restaurante.restaurante.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{
    
}
