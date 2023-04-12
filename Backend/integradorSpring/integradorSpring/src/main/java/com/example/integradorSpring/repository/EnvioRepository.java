package com.example.integradorSpring.repository;

import com.example.integradorSpring.entity.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvioRepository extends JpaRepository <Envio, Integer> {

}
