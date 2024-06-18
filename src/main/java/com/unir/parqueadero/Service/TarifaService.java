package com.unir.parqueadero.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unir.parqueadero.Model.Dto.TarifaDto;
import com.unir.parqueadero.Persistence.Contracts.TarifaDTORepository;

@Service
public class TarifaService {
    
    @Autowired
    private TarifaDTORepository tarifaRepository;

    public List<TarifaDto> getAll(){
        return tarifaRepository.getAll();
    }

    public Optional<TarifaDto> getControl(int controlId){
        return tarifaRepository.getTarifa(controlId);
    }

    public TarifaDto save(TarifaDto control) {
        return tarifaRepository.save(control);
    }

    public void delete(int controlId) {
        tarifaRepository.delete(controlId);
    }
}
