package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "becas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Becas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_beca")
    private Integer idBeca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno")
    private Alumnos alumno;

    @Column(name = "tipo_beca", length = 9)
    private String tipoBeca;

    @Column(name = "porcentaje", precision = 5, scale = 2)
    private BigDecimal porcentaje;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    @Column(name = "estatus", length = 10)
    private String estatus;
}
