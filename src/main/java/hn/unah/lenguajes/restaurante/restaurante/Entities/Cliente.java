package hn.unah.lenguajes.restaurante.restaurante.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private long idcliente; 

    @Column(name = "nombrecliente")
    private String nombrecliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idusuario")
    private Usuario usuario;
    
    @OneToOne(mappedBy = "cliente")
    private Factura factura;
}
