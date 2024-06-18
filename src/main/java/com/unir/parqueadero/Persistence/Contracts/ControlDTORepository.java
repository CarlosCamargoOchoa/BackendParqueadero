package com.unir.parqueadero.Persistence.Contracts;
import java.util.List;
import java.util.Optional;
import com.unir.parqueadero.Model.Dto.ControlDto;

public interface ControlDTORepository {
    List<ControlDto> getAll(); 
    Optional<ControlDto> getControl(int controlId);
    ControlDto save(ControlDto control);
    void delete(int controlId);
}
