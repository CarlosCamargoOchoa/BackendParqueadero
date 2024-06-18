package com.unir.parqueadero.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unir.parqueadero.Model.Dto.TarifaDto;
import com.unir.parqueadero.Service.TarifaService;


// import com.unir.parqueadero.Model.Dto.ControlDto;
// import com.unir.parqueadero.Service.ControlService;

// import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/tarifa")
public class TarifaController {

    @Autowired
    private TarifaService TarifaService;

    @GetMapping("/all")
    public ResponseEntity<List<TarifaDto>> getAll() {
        return new ResponseEntity<>(TarifaService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/tarifaById/{id}")
    public ResponseEntity<TarifaDto> getControl(@PathVariable("id") int tarifaId) {
        return TarifaService.getControl(tarifaId)
                .map(tarifa -> new ResponseEntity<>(tarifa, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<TarifaDto> save(@RequestBody TarifaDto tarifa) {
        return new ResponseEntity<>(TarifaService.save(tarifa), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int tarifaId) {
        TarifaService.delete(tarifaId);
        return new ResponseEntity(HttpStatus.OK);
    }
 

}
