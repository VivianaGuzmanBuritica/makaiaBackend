package com.example.integradorSpring.Controller;

import com.example.integradorSpring.entity.Cliente;
import com.example.integradorSpring.Service.ClienteService;
import com.example.integradorSpring.dto.ClienteDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class ClienteController {
    private ClienteService service;

    @Autowired
    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/cliente")
    public String prueba(){
        return "Hola";
    }
    @PostMapping("/clientes")
    public ClienteDTO    crear(@RequestBody ClienteDTO cliente){
        return service.crear(cliente);
    }

    @GetMapping("/clientes/{cedula}")
    public ClienteDTO buscar(@PathVariable("cedula") Integer cedula){
        return service.buscar(cedula);
    }

    @PutMapping("/clientes/{cedula}")
    public ClienteDTO actualizar(@PathVariable("cedula") Integer cedula, @RequestBody ClienteDTO cliente){
        return service.actualizar(cedula, cliente);
    }

    @DeleteMapping("/clientes/{cedula}")
    public boolean eliminar(@PathVariable("cedula") Integer cedula){
        return service.eliminar(cedula);
    }
}
