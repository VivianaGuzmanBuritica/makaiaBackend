package com.example.integradorSpring.Controller;

import com.example.integradorSpring.Service.PaqueteService;
import com.example.integradorSpring.dto.PaqueteDTO;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PaqueteController {
//
//    private PaqueteService service;
//
//    @Autowired
//    public PaqueteController(PaqueteService service) {
//        this.service = service;
//    }
//
//    @PostMapping("/paquete")
//    public PaqueteDTO crear(@RequestBody PaqueteDTO paquete){ return null;}
}
