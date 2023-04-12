package com.example.integradorSpring.Controller;


import com.example.integradorSpring.Service.EnvioService;
import com.example.integradorSpring.dto.EnvioDTO;
import com.example.integradorSpring.entity.Envio;
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

    @PostMapping("/cliente/{cedula}/paquete/{id}/envio")
    public EnvioDTO crear( @PathVariable("cedula") Integer cedula,
                           @PathVariable("id") Integer id,
                           @RequestBody EnvioDTO envio){
        return service.crear(cedula, id, envio);
    }

    @GetMapping("/envio/{estado}")
    public List<Envio> filtar(@PathVariable ("estado") String estado){
        return service.filtar(estado);
    }
}
