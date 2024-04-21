package hn.unah.lenguajes.restaurante.restaurante.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Ingrediente;

public interface IngredienteRepository extends CrudRepository<Ingrediente, Long>{
    
}
