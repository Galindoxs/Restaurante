package hn.unah.lenguajes.restaurante.restaurante.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Factura;

public interface FacturaRepository extends CrudRepository<Factura, Long>{
    
}
