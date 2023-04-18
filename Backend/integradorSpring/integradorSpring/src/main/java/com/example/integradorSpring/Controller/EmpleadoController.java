package com.example.integradorSpring.Controller;


import com.example.integradorSpring.Service.ClienteService;
import com.example.integradorSpring.Service.EmpleadoService;
import com.example.integradorSpring.dto.EmpleadoDTO;
import com.example.integradorSpring.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmpleadoController {

    private EmpleadoService service;

    @Autowired
    public EmpleadoController(EmpleadoService service) {
        this.service = service;
    }

    @PostMapping("/empleados")
    public EmpleadoDTO crear(@RequestBody EmpleadoDTO empleado){
        return service.crear(empleado);
    }

    @GetMapping("/empleados/{cedula}")
    public EmpleadoDTO buscar(@PathVariable("cedula") Integer cedula){
        return service.buscar(cedula);
    }

    @PutMapping("/empleados/{cedula}")
    public EmpleadoDTO actualizar(@PathVariable("cedula") Integer cedula, @RequestBody EmpleadoDTO empleado){
        return service.actualizar(cedula, empleado);
    }

    @DeleteMapping("/empleados/{cedula}")
    public boolean eliminar(@PathVariable("cedula") Integer cedula){
        return service.eliminar(cedula);
    }
}
