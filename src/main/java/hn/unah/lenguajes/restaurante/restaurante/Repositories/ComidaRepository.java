package hn.unah.lenguajes.restaurante.restaurante.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Comida;

public interface ComidaRepository extends CrudRepository<Comida, Long>{
    
}
