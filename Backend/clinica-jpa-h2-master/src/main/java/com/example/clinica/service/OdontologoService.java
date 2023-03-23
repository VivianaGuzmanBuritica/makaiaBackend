package com.example.clinica.service;

import com.example.clinica.model.Odontologo;
import com.example.clinica.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class OdontologoService {
    private OdontologoRepository  odontologoRepository;

    @Autowired
    public OdontologoService(OdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    public Odontologo crear (Odontologo odontologo){
        this.odontologoRepository.save(odontologo);
        return odontologo;
    }

    public List<Odontologo> mostrar(){
       return (List<Odontologo>) odontologoRepository.findAll();
    }

    public boolean borrar(Integer matricula){
       if(odontologoRepository.existsById(matricula)) {
           this.odontologoRepository.deleteById(matricula);
           return true;
       }else{
           return false;}
    }
}














