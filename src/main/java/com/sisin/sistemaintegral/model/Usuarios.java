package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_persona")
    private Integer idPersona;

    @Column(name = "tipo_usuario", length = 14)
    private String tipoUsuario;

    @Column(name = "username", unique = true, length = 100)
    private String username;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "activo")
    private Integer activo;
}
