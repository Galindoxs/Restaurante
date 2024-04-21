package hn.unah.lenguajes.restaurante.restaurante.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Orden;

public interface OrdenRepository extends CrudRepository<Orden, Long>{
    
}
