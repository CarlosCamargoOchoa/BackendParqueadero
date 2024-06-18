package com.unir.parqueadero.Persistence.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unir.parqueadero.Model.Dto.ControlDto;
import com.unir.parqueadero.Model.Entity.ControlEntity;
import com.unir.parqueadero.Persistence.Contracts.ControlDTORepository;
import com.unir.parqueadero.Persistence.Contracts.IControlCRUDRepository;
import com.unir.parqueadero.Persistence.Mappers.IControlMapping;

@Repository
public class ControlRepository implements ControlDTORepository {

    @Autowired
    private IControlCRUDRepository controlRepository;
    @Autowired
    private IControlMapping mapper;

    @Override
    public List<ControlDto> getAll() {
        List<ControlEntity> controles = (List<ControlEntity>) controlRepository.findAll();
        return mapper.toDtos(controles);
    }

    @Override
    public Optional<ControlDto> getControl(int controlId) {
        return controlRepository.findById(controlId)
                .map(producto -> mapper.toDto(producto));
    }

    @Override
    public ControlDto save(ControlDto control) {
        ControlEntity producto = mapper.toEntity(control);
        return mapper.toDto(controlRepository.save(producto));
    }

    @Override
    public void delete(int controlId) {
       controlRepository.deleteById(controlId);
    }

}
