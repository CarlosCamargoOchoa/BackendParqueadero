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

import com.unir.parqueadero.Model.Dto.ControlDto;
import com.unir.parqueadero.Service.ControlService;

@RestController
@RequestMapping("/control")
@CrossOrigin(origins = "*")
public class ControlController {

    @Autowired
    private ControlService controlService;

    @GetMapping("/all")
    public ResponseEntity<List<ControlDto>> getAll() {
        return new ResponseEntity<>(controlService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/coltrolById/{id}")
    public ResponseEntity<ControlDto> getControl(@PathVariable("id") int controlId) {
        return controlService.getControl(controlId)
                .map(control -> new ResponseEntity<>(control, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<ControlDto> save(@RequestBody ControlDto control) {
        return new ResponseEntity<>(controlService.save(control), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int controlId) {
        controlService.delete(controlId);
        return new ResponseEntity(HttpStatus.OK);
    }

}
