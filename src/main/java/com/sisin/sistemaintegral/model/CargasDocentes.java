package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cargas_docentes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CargasDocentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carga")
    private Integer idCarga;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_docente")
    private Docentes docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_asignatura")
    private Asignaturas asignatura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_grupo")
    private Grupos grupo;

    @Column(name = "horas_semana")
    private Integer horasSemana;

    @Column(name = "ciclo_escolar", length = 20)
    private String cicloEscolar;
}
