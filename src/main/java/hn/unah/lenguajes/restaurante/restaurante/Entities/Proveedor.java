package hn.unah.lenguajes.restaurante.restaurante.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "proveedores")
@Data
public class Proveedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproveedor")
    private long idproveedor;

    @Column(name = "nombreproveedor")
    private String nombreproveedor;

    @ManyToMany
    @JoinTable(name = "ingrediente_proveedor", joinColumns = @JoinColumn(name = "idproveedor"),
    inverseJoinColumns = @JoinColumn(name = "idingrediente"))
    private List<Ingrediente> ingrediente;
}
