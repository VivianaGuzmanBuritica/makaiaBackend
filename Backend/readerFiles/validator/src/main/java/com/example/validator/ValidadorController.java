package com.example.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ValidadorController {

    private ValidadorService validador;

    @Autowired
    public ValidadorController(ValidadorService validador) {
        this.validador = validador;
    }

    @PostMapping("/validar")
    public Boolean validar(@RequestBody Persona persona){
       return validador.validar(persona);
    }

}
