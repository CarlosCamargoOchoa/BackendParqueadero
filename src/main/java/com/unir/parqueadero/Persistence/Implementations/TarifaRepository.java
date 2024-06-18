package com.unir.parqueadero.Persistence.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unir.parqueadero.Model.Dto.TarifaDto;
import com.unir.parqueadero.Model.Entity.TarifaEntity;
import com.unir.parqueadero.Persistence.Contracts.ITarifaCRUDRepository;
import com.unir.parqueadero.Persistence.Contracts.TarifaDTORepository;
import com.unir.parqueadero.Persistence.Mappers.ITarifaMapping;

@Repository
public class TarifaRepository implements  TarifaDTORepository {

    @Autowired
    private ITarifaCRUDRepository tarifaRepository;
    @Autowired
    private ITarifaMapping mapper;

    @Override
    public List<TarifaDto> getAll() {
        List<TarifaEntity> tarifas = (List<TarifaEntity>) tarifaRepository.findAll();
        return mapper.toDtos(tarifas);
    }

    @Override
    public Optional<TarifaDto> getTarifa(int tarifaId) {
        return tarifaRepository.findById(tarifaId)
        .map(producto -> mapper.toDto(producto));
    }

    @Override
    public TarifaDto save(TarifaDto tarifa) {
        TarifaEntity tarifas = mapper.toEntity(tarifa);
        return mapper.toDto(tarifaRepository.save(tarifas));
    }
    @Override
    public void delete(int tarifaId) {
        tarifaRepository.deleteById(tarifaId);
    }

    

    
}
