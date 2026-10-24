package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "docentes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Docentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_docente")
    private Integer idDocente;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "numero_trabajador", length = 20)
    private String numeroTrabajador;

    @Column(name = "disponibilidad", columnDefinition = "TEXT")
    private String disponibilidad;

    @Column(name = "user_id")
    private Integer userId;
}
