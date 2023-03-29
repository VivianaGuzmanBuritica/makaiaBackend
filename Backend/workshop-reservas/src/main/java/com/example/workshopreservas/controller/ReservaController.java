package com.example.workshopreservas.controller;

import com.example.workshopreservas.entity.Reserva;
import com.example.workshopreservas.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/v1")
public class ReservaController {

    private ReservaService service;

    @Autowired
    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @PostMapping("/cliente/{cedula}/habitacion/{numero}/fecha/{fecha}/reservar")
    public Reserva reservar(@PathVariable("cedula") Integer cedula, @PathVariable("numero") Integer numero, @PathVariable("fecha") String fechaReserva){
        return service.reservar(cedula, numero, fechaReserva);
    }
}
