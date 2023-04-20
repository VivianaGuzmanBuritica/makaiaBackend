package com.example.integradorSpring.Controller;


import com.example.integradorSpring.Service.ClienteService;
import com.example.integradorSpring.Service.EmpleadoService;
import com.example.integradorSpring.dto.EmpleadoDTO;
import com.example.integradorSpring.entity.Empleado;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Su solicitud se ha procesado correctamente"),
            @ApiResponse(code = 404, message = " El servidor no ha podido encontrar el recurso solicitado, intene nuevamente"),
            @ApiResponse(code = 500, message = "Lo sentimos, ha habido un error interno en el servidor, no ha sido posible procesar la solicitud.")
    })

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
    public String eliminar(@PathVariable("cedula") Integer cedula){
        return service.eliminar(cedula);
    }
}
