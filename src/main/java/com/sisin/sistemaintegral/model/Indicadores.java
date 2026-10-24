package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "indicadores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Indicadores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_indicador")
    private Integer idIndicador;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "formula_calculo", columnDefinition = "TEXT")
    private String formulaCalculo;

    @Column(name = "periodicidad", length = 9)
    private String periodicidad;
}
