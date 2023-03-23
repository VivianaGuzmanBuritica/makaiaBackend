package com.example.integradorSpring.Controller;

import com.example.integradorSpring.Model.Envio;
import com.example.integradorSpring.Service.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EnvioController {

    private EnvioService service;

    @Autowired
    public EnvioController(EnvioService service) {
        this.service = service;
    }

    @PostMapping("/envio")
    public Envio crear(@RequestBody Envio envio){
        return service.crear(envio);
    }

    @GetMapping("/envio/{estado}")
    public List<Envio> filtar(@PathVariable ("estado") String estado){
        return service.filtar(estado);
    }
}
