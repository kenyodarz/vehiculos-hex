package com.sena.appvehiculosbackend.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "vehiculo", uniqueConstraints = {
        @UniqueConstraint(columnNames = "placa")
})
@Getter
@Setter
@NoArgsConstructor
public class Vehiculo {

    @Id
    private Long idVehiculo;
    @NotBlank
    private String placa;
    @NotBlank
    private int marcaId;
    @NotBlank
    private int capacidadTanqueo;
    @NotBlank
    private int tipoVehiculoId;
    @NotBlank
    private int tipoCombustibleId;
    @NotBlank
    private String serieChip;
    private int kilometraje;
    private LocalDate ultimoCambioAceite;
    private LocalDate ultimaSincronizacion;
    private LocalDate ultimaAlineacion;
    private LocalDate ultimoCambioLlantas;
    private LocalDate fechaVencimientoTecnomecanica;
    private LocalDate fechaVencimientoSoat;
    private LocalDate fechaVencimientoExtintor;
    @NotBlank
    private int capacidadExtintor;
    @NotBlank
    private String estadoVehiculo;

}
