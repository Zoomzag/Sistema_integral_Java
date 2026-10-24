package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "datos_indicadores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DatosIndicadores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dato_indicador")
    private Integer idDatoIndicador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_indicador")
    private Indicadores indicador;

    @Column(name = "valor", precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(name = "fecha_calculo")
    private LocalDate fechaCalculo;

    @Column(name = "ciclo_escolar", length = 20)
    private String cicloEscolar;
}
