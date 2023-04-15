package com.example.integradorSpring.Service.patronState;

import com.example.integradorSpring.dto.EnvioEstadoDTO;

public class EstadoEnRuta implements Estado{
    @Override
    public String cambiarEstado(EnvioEstadoDTO envioEstadoDTO) {
        envioEstadoDTO.setEstado(new EstadoEntregado());
        return "ENTREGADO";
    }
}
