package com.example.workshopreservas.controller;

import com.example.workshopreservas.dto.ClienteDTO;
import com.example.workshopreservas.entity.Cliente;
import com.example.workshopreservas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {
    private ClienteService service;

    @Autowired
    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping("/cliente")
    public ClienteDTO crear(@RequestBody ClienteDTO cliente){
        return service.crear(cliente);
    }
}
