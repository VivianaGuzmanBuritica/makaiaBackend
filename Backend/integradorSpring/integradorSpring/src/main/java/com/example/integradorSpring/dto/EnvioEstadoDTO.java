package com.example.integradorSpring.dto;

import com.example.integradorSpring.Service.patronState.Estado;
import org.springframework.beans.factory.annotation.Autowired;

public class EnvioEstadoDTO {
    private static final String ESTADO_INICIAL = "RECIBIDO";
    private Estado estado;

    @Autowired
    public EnvioEstadoDTO(Estado estado) {
        this.estado = estado;
    }

    public EnvioEstadoDTO() {
    }

    public String cambiarEstado(){
        return estado.cambiarEstado(this);
    }
    public String getEstadoInicial() {
        return ESTADO_INICIAL;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


}
