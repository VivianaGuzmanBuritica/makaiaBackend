package com.example.integradorSpring.Service;

import com.example.integradorSpring.dto.PaqueteDTO;
import com.example.integradorSpring.entity.Paquete;
import com.example.integradorSpring.repository.PaqueteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaqueteService {

    private PaqueteRepository paqueteRepository;

    @Autowired
    public PaqueteService(PaqueteRepository paqueteRepository) {
        this.paqueteRepository = paqueteRepository;
    }

    public PaqueteDTO crear(PaqueteDTO paqueteDTO){
//        if(paqueteDTO.getTipo() == null || paqueteDTO.getPeso() == 0){
//            throw new RuntimeException("el tipo o el peso son invalidos");
//    }

        Paquete paquete = new Paquete(
                paqueteDTO.getTipo(),
                paqueteDTO.getPeso(),
                paqueteDTO.getValorDeclarado()
        );

        paqueteRepository.save(paquete);
        return paqueteDTO;
    }

}
