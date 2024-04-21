package hn.unah.lenguajes.restaurante.restaurante.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Factura;
import hn.unah.lenguajes.restaurante.restaurante.Services.Impl.FacturaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController

@RequestMapping("/api")
public class FacturaController {
    
    @Autowired
    private FacturaServiceImpl facturaServiceImpl;

    @PostMapping("/factura/crear")
    public Factura crearComida(@RequestBody Factura factura) {        
        return facturaServiceImpl.crearFactura(factura);
    }
    
    
}
