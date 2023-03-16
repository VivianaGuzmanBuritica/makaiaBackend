package com.reader.readerFiles;

import model.Archivo;
import model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.LectorArchivos;

import java.util.List;

@RestController
@RequestMapping("/procesador")
public class procesadorController {
    @Autowired
    private LectorArchivos lectorArchivos;

    @GetMapping("/prueba")
    public String prueba(){
        return "conectado";
    }

    @PostMapping("/leer")
    public List<Persona> leer(@RequestBody Archivo archivo){
        System.out.println("ENCONTRADO");
        return  this.lectorArchivos.leer(archivo);
    }


}
