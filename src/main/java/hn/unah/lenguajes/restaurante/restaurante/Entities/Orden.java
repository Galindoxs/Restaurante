package hn.unah.lenguajes.restaurante.restaurante.Entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ordenes")
@Data
public class Orden {
    
    @Id
    @Column(name = "idorden")
    private long idorden;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idcomida")
   private Comida comida;

   @ManyToOne
   private Factura factura;
}
