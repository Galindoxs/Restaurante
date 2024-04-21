package hn.unah.lenguajes.restaurante.restaurante.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "comidas")
@Data
public class Comida {
    
    @Id
    @Column(name = "idcomida")
    private long idcomida;

    private String nombre;

    private double precio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtipo")
    private TipoComida tipoComida;

    //Relaciones

    @OneToOne(mappedBy = "comida")
    private Orden orden;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "comida_ingrediente", joinColumns = @JoinColumn(name = "idcomida"),
    inverseJoinColumns = @JoinColumn(name = "idingrediente"))
    private List<Ingrediente> ingrediente;
}
