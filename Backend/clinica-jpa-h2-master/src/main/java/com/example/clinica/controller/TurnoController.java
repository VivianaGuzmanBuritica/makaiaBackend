package com.example.clinica.controller;

import com.example.clinica.model.Turno;
import com.example.clinica.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class TurnoController {

    private TurnoService service;

   @Autowired
   public TurnoController(TurnoService service) {
        this.service = service;
    }

    @PostMapping("/paciente/{dni}/odontologo/{matricula}/fecha/{fecha}/generar")
    public Turno generar( @PathVariable ("dni") Integer dni, @PathVariable("matricula") Integer matricula,@PathVariable("fecha") String fechaTurno){
       return service.generar(dni, matricula, fechaTurno);
    }
    //crear controlador de asignar el turno.
}
