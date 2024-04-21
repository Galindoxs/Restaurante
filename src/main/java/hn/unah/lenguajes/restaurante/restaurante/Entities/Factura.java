package hn.unah.lenguajes.restaurante.restaurante.Entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "facturas")
@Data
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfactura")
    private long idfactura;

    @Column(name = "fechaemision")
    private LocalDate fechaemision;

    @OneToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "factura")
    private List<Orden> orden;

}
