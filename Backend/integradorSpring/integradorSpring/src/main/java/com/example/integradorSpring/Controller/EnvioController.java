package com.example.integradorSpring.Controller;

import com.example.integradorSpring.Model.Envio;
import com.example.integradorSpring.Service.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EnvioController {

    private EnvioService service;

    @Autowired
    public EnvioController(EnvioService service) {
        this.service = service;
    }

    @PostMapping("/envio/nuevo")
    public Envio crear(@RequestBody Envio envio){
        return service.crear(envio);
    }

}
