package com.reader.readerFiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/procesador")
public class procesadorController {

    private LectorArchivoCsv lectorArchivos;
    @Autowired
    public procesadorController(LectorArchivoCsv lectorArchivos) {
        this.lectorArchivos = lectorArchivos;
    }

    @GetMapping("/prueba")
    public String prueba(){
     return "conectar";
    }

    @PostMapping("/leer")
    public List<Persona> leer(@RequestBody Archivo archivo){
        System.out.println("ENCONTRADO");
        return  this.lectorArchivos.leer(archivo);
    }


}
