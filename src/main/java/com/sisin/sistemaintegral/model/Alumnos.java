package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "alumnos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Alumnos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer idAlumno;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "numero_control", length = 20)
    private String numeroControl;

    @Column(name = "id_grupo")
    private Integer idGrupo;

    @Column(name = "user_id")
    private Integer userId;
}
