package com.sisin.sistemaintegral.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "documentos_alumnos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentosAlumnos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_documento")
    private Integer idDocumento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno")
    private Alumnos alumno;

    @Column(name = "tipo_documento", length = 15)
    private String tipoDocumento;

    @Column(name = "nombre_documento")
    private String nombreDocumento;

    @Column(name = "archivo", columnDefinition = "TEXT")
    private String archivo;

    @Column(name = "fecha_subida")
    private LocalDateTime fechaSubida;
}
