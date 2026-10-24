package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "asistencias_docentes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AsistenciasDocentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asistencia_docente")
    private Integer idAsistenciaDocente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_docente")
    private Docentes docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_horario")
    private Horarios horario;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "presente")
    private Integer presente;

    @Column(name = "justificacion", columnDefinition = "TEXT")
    private String justificacion;

    @Column(name = "hora_llegada")
    private LocalTime horaLlegada;
}
