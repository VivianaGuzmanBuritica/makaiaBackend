package com.example.numeros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class NumeroController {

    NumeroService numeroService;

    public NumeroController() {
        this.numeroService = new NumeroService();
    }

    @GetMapping("/numero/{numero}")
    public int obtenerNumeros(@PathVariable("numero") Integer numero)
    {
        return this.numeroService.obtenerTotal(numero);
    }
}
