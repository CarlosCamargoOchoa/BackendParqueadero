package com.unir.parqueadero.Model.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="control")
@Setter
@Getter
@NoArgsConstructor
public class ControlEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idControl;
    private String placa;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;
    private int idTarifa;
    private Double total;

    @ManyToOne
    @JoinColumn(name="idTarifa",insertable = false,updatable = false)
    private TarifaEntity tarifaModel;

  
}
