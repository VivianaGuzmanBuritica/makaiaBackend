package com.example.clinica.controller;

import com.example.clinica.model.Odontologo;
import com.example.clinica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class OdontoloController {

    private OdontologoService odontologoService;

    @Autowired
    public OdontoloController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @PostMapping("/odontologo")
    public Odontologo crear(@RequestBody Odontologo odontologo) {
        return this.odontologoService.crear(odontologo);
    }

    @GetMapping("/odontologos")
    public List<Odontologo> mostrar(){
        return this.odontologoService.mostrar();
    }

    @DeleteMapping("/odontologo/{matricula}")
    public boolean borrar(@PathVariable ("matricula") Integer matricula){
        return this.odontologoService.borrar(matricula);
    }

}
