package com.unir.parqueadero.Persistence.Contracts;

import java.util.List;
import java.util.Optional;

import com.unir.parqueadero.Model.Dto.TarifaDto;

public interface TarifaDTORepository {
    List<TarifaDto> getAll(); 
    Optional<TarifaDto> getTarifa(int tarifaId);
    TarifaDto save(TarifaDto tarifa);
    void delete(int tarifaId);
}
