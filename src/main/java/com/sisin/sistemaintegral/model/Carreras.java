package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "carreras")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Carreras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera")
    private Integer idCarrera;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "perfil_egreso", columnDefinition = "TEXT")
    private String perfilEgreso;

    @Column(name = "plan_estudios_documento", columnDefinition = "TEXT")
    private String planEstudiosDocumento;

    @Column(name = "mapa_curricular", columnDefinition = "TEXT")
    private String mapaCurricular;

    @Column(name = "vigente")
    private Integer vigente;
}
