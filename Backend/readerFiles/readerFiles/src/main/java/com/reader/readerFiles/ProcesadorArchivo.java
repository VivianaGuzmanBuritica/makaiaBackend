package com.reader.readerFiles;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Component
public class ProcesadorArchivo{

    public boolean procesar(Persona persona){

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Persona> request = new HttpEntity<>(persona, headers);
        boolean response = restTemplate.postForObject("http://localhost:8082/api/v1/validar", request, Boolean.class);
        return  response;
    }
}
