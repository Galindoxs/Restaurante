package hn.unah.lenguajes.restaurante.restaurante.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Ingrediente;
import hn.unah.lenguajes.restaurante.restaurante.Entities.Proveedor;
import hn.unah.lenguajes.restaurante.restaurante.Repositories.ProveedorRepository;
import hn.unah.lenguajes.restaurante.restaurante.Services.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{

    @Autowired
    private ProveedorRepository proveedorRepository;

    // @Autowired
    // private IngredienteRepository ingredienteRepository;

    @Override
    public Proveedor crearProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Ingrediente asignarAInventario(long idproveedor, String idproducto) {
        
        return null;
    }
    
}
