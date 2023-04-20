package com.example.integradorSpring.Controller;


import com.example.integradorSpring.Service.EnvioService;
import com.example.integradorSpring.dto.*;
import com.example.integradorSpring.entity.Envio;
import com.example.integradorSpring.exception.ApiRequestException;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Su solicitud se ha procesado correctamente"),
            @ApiResponse(code = 404, message = " El servidor no ha podido encontrar el recurso solicitado, intene nuevamente"),
            @ApiResponse(code = 500, message = "Lo sentimos, ha habido un error interno en el servidor, no ha sido posible procesar la solicitud.")
    })

    @PostMapping("/envio")
    public EnvioCreadoDTO crear(@RequestBody EnvioDTO envio){
        return service.crear(envio);
    }


    // con PUT , envio/estado
    @PutMapping("/envio/estado")
    public EnvioCreadoDTO cambiarEstado(@RequestBody EnvioCambiarEstadoDTO envioCambiarEstadoDTO){
        return service.cambiarEstado(envioCambiarEstadoDTO);
    }
    //
    @GetMapping("/envio/{num-guia}")
    public EnvioDetalleDTO buscar(@PathVariable("num-guia") Integer numGuia){
        return service.buscar(numGuia);
    }
    @GetMapping("/envio/estado/{estado}")
    public List<Envio> filtar (@PathVariable ("estado") String estado){

        return service.filtar(estado);
    }
}
