package com.sisin.sistemaintegral.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "evaluaciones_docentes")
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EvaluacionesDocentes {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evaluacion")
    private Integer idEvaluacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_docente")
    private Docentes docente;

    @Column(name = "id_evaluador")
    private Integer idEvaluador;

    @Column(name = "tipo_evaluacion", length = 20)
    private String tipoEvaluacion;

    @Column(name = "puntuacion", precision = 3, scale = 1)
    private BigDecimal puntuacion;

    @Column(name = "comentarios", columnDefinition = "TEXT")
    private String comentarios;

    @Column(name = "fecha_evaluacion")
    private LocalDate fechaEvaluacion;

}
