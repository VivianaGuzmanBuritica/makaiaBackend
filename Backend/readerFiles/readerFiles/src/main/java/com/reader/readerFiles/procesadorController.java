package com.reader.readerFiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class procesadorController {
    private procesadorService service;

    @Autowired
    public procesadorController(procesadorService service) {
        this.service = service;
    }
    @PostMapping("/procesar")
    public RespuestaArchivo procesar(@RequestBody Archivo archivo){
        return this.service.procesa(archivo);
    }



}
