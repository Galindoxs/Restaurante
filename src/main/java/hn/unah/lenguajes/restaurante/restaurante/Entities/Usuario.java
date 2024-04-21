package hn.unah.lenguajes.restaurante.restaurante.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @Column(name = "idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idusuario;

    @Column(name = "nombreusuario")
    private String nombreusuario;

    @Column(name = "contraseniausuario")
    private String contraseniausuario;

    @OneToOne(mappedBy = "usuario")
    private Cliente cliente;
}
