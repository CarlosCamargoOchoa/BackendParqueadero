package com.unir.parqueadero.Model.Entity;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tarifa")
@Setter
@Getter
@NoArgsConstructor
public class TarifaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarifa;	
    private String tipoVehiculo;	
    private Double tarifa;	
    private String unidadMedida;	
    private boolean estado;

    @OneToMany(mappedBy = "tarifaModel")
    private List<ControlEntity> tarifaModel;

}
