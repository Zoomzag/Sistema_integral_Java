package com.sisin.sistemaintegral.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservaciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservacion")
    private Integer idReservacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_material")
    private MaterialesBiblioteca material;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuarios usuario;

    @Column(name = "fecha_reservacion")
    private LocalDateTime fechaReservacion;

    @Column(name = "fecha_vencimiento_reserva")
    private LocalDate fechaVencimientoReserva;

    @Column(name = "estatus", length = 10)
    private String estatus;
}
