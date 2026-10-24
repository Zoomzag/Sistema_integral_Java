package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity 
@Table(name = "asistencia")
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
public class Asistencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asistencia")
    private Integer idAsistencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno")
    private Alumnos alumno;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "presente")
    private Integer presente;

    @Column(name = "justificante", columnDefinition = "TEXT")
    private String justificante;

}
