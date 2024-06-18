package com.unir.parqueadero.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unir.parqueadero.Model.Dto.ControlDto;
import com.unir.parqueadero.Persistence.Contracts.ControlDTORepository;

@Service
public class ControlService {

    @Autowired
    private ControlDTORepository controlRepository;

    public List<ControlDto> getAll(){
        return controlRepository.getAll();
    }

    public Optional<ControlDto> getControl(int controlId){
        return controlRepository.getControl(controlId);
    }

    public ControlDto save(ControlDto control) {
        return controlRepository.save(control);
    }

    public void delete(int controlId) {
        controlRepository.delete(controlId);
    }

}
