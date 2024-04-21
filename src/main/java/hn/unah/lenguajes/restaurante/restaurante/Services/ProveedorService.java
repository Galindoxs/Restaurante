package hn.unah.lenguajes.restaurante.restaurante.Services;

import hn.unah.lenguajes.restaurante.restaurante.Entities.Ingrediente;
import hn.unah.lenguajes.restaurante.restaurante.Entities.Proveedor;

public interface ProveedorService {
    
    public Proveedor crearProveedor(Proveedor proveedor);

    public Ingrediente asignarAInventario(long idproveedor, String idproducto);
}
