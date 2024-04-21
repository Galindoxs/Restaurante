package hn.unah.lenguajes.restaurante.restaurante.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Factura;
import hn.unah.lenguajes.restaurante.restaurante.Repositories.FacturaRepository;
import hn.unah.lenguajes.restaurante.restaurante.Services.FacturaService;

@Service
public class FacturaServiceImpl implements FacturaService{

    @Autowired
    private FacturaRepository facturaRepository;
    
    @Override
    public Factura crearFactura(Factura factura) {
        return facturaRepository.save(factura);
    }
    
}
