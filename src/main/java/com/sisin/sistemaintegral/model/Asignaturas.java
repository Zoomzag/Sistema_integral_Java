package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

@Entity 
@Table(name = "asignatura")
@Getter
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
public class Asignaturas {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private Integer idAsignatura;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carrera")
    private Carreras carrera;

    @Column(name = "nombre", nullable = false)
    private String name;

    @Column(name = "creditos")
    private Integer creditos;

    @Column(name = "horas_semana")
    private Integer horas_semana;
}
