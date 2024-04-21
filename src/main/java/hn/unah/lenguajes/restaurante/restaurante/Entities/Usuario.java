package hn.unah.lenguajes.restaurante.restaurante.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @Column(name = "nombreusuario")
    private String nombreusuario;

    @Column(name = "contraseniausuario")
    private String contraseniausuario;

    @OneToOne(mappedBy = "usuario")
    private Cliente cliente;
}
