package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Table(name = "reportes_estadisticos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReportesEstadisticos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reporte")
    private Integer idReporte;

    @Column(name = "tipo_reporte", length = 19)
    private String tipoReporte;

    @Column(name = "fecha_generacion")
    private LocalDateTime fechaGeneracion;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "parametros", columnDefinition = "JSON")
    private Map<String, Object> parametros;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "datos", columnDefinition = "JSON")
    private Map<String, Object> datos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario_generador")
    private Usuarios usuarioGenerador;
}
