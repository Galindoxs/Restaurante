package hn.unah.lenguajes.restaurante.restaurante.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tipocomidas")
@Data
public class TipoComida {
    
    @Id
    @Column(name = "idtipo")
    private String idtipo;

    @Column(name = "nombretipo")
    private String nombretipo;

    @OneToOne(mappedBy = "tipoComida") 
    private Comida comida;

}
