package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "materiales_biblioteca")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MaterialesBiblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_material")
    private Integer idMaterial;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "autor")
    private String autor;

    @Column(name = "tipo_material", length = 11)
    private String tipoMaterial;

    @Column(name = "isbn", length = 20)
    private String isbn;

    @Column(name = "editorial")
    private String editorial;

    // La columna se llama "año_publicacion"; se escapa con comillas invertidas por el carácter especial
    @Column(name = "`año_publicacion`")
    private Integer anioPublicacion;

    @Column(name = "ejemplares_disponibles")
    private Integer ejemplaresDisponibles;

    @Column(name = "ubicacion", length = 100)
    private String ubicacion;
}
