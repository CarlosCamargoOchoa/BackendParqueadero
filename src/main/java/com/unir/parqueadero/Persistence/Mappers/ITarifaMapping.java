package com.unir.parqueadero.Persistence.Mappers;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.unir.parqueadero.Model.Dto.TarifaDto;
import com.unir.parqueadero.Model.Entity.TarifaEntity;

@Mapper(componentModel = "spring")
public interface ITarifaMapping {
    @Mappings({
        @Mapping(source = "idTarifa", target = "tarifaID"),
        @Mapping(source = "tipoVehiculo", target = "tipoVehiculo"),
        @Mapping(source = "tarifa", target = "tarifa"),
        @Mapping(source = "unidadMedida", target = "unidadMedida"),
        @Mapping(source = "estado", target = "estado"),
    })
    TarifaDto toDto(TarifaEntity tarifa);
    List<TarifaDto> toDtos(List<TarifaEntity> tarifa);

    @InheritInverseConfiguration
    @Mapping(target = "tarifaModel", ignore=true)
    TarifaEntity toEntity(TarifaDto tarifa);
}
