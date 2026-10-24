package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "estados_cuenta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstadosCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_cuenta")
    private Integer idEstadoCuenta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno")
    private Alumnos alumno;

    @Column(name = "fecha_generacion")
    private LocalDate fechaGeneracion;

    @Column(name = "saldo_actual", precision = 10, scale = 2)
    private BigDecimal saldoActual;

    @Column(name = "estatus", length = 12)
    private String estatus;
}
