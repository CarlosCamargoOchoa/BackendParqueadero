package com.unir.parqueadero.Persistence.Mappers;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.unir.parqueadero.Model.Dto.ControlDto;
import com.unir.parqueadero.Model.Entity.ControlEntity;

@Mapper(componentModel = "spring")
public interface IControlMapping {

    @Mappings({
        @Mapping(source = "idControl", target = "controlID"),
        @Mapping(source = "placa", target = "placa"),
        @Mapping(source = "horaIngreso", target = "horaIngreso"),
        @Mapping(source = "horaSalida", target = "horaSalida"),
        @Mapping(source = "idTarifa", target = "tarifaID"),
        @Mapping(source = "total", target = "total"),
    })
    ControlDto toDto(ControlEntity control);
    List<ControlDto> toDtos(List<ControlEntity> control);

    @InheritInverseConfiguration
    @Mapping(target = "tarifaModel", ignore=true)
    ControlEntity toEntity(ControlDto control);

}
