package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "conceptos_pago")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConceptosPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_concepto")
    private Integer idConcepto;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "monto", precision = 10, scale = 2)
    private BigDecimal monto;

    @Column(name = "periodicidad", length = 9)
    private String periodicidad;

    @Column(name = "obligatorio")
    private Integer obligatorio;
}
