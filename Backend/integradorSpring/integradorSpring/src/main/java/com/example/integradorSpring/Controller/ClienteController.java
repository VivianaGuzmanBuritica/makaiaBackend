package com.example.integradorSpring.Controller;

import com.example.integradorSpring.Model.Cliente;
import com.example.integradorSpring.Service.ClienteService;
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

    @PostMapping("/clientes/nuevo")
    public Cliente crear(@RequestBody Cliente cliente){
        return service.crear(cliente);
    }

    @GetMapping("/clientes/{cedula}")
    public List<Cliente> buscar(@PathVariable("cedula") String cedula){
        return service.buscar(cedula);
    }

    @PutMapping("/clientes/{cedula}")
    public List<Cliente> actualizar(@PathVariable("cedula") String cedula, @RequestBody Cliente cliente){
        return service.actualizar(cedula);
    }

    @DeleteMapping("/clientes/{cedula}")
    public boolean eliminar(@PathVariable("cedula") String cedula){
        return service.eliminar(cedula);
    }
}
