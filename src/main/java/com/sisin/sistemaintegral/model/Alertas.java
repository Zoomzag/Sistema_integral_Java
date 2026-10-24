package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "alertas")
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 

public class Alertas {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alerta")
    private Integer idAlerta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno")
    private Alumnos alumno;

    @Column(name = "tipo", length = 17)
    private String tipo;
    
    @Column(name = "mensaje", columnDefinition = "TEXT")
    private String mensaje;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "leida")
    private Integer leida;
    

}
