package com.example.integradorSpring.dto;

import io.swagger.models.auth.In;

public class EnvioCambiarEstadoDTO {
    private Integer numGuia;
    private  String estado;
    private Integer cedulaEmpleado;

    public EnvioCambiarEstadoDTO(Integer numGuia, String estado, Integer cedulaEmpleado) {
        this.numGuia = numGuia;
        this.estado = estado;
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public EnvioCambiarEstadoDTO() {
    }

    public Integer getNumGuia() {
        return numGuia;
    }

    public String getEstado() {
        return estado;
    }

    public Integer getCedulaEmpleado() {
        return cedulaEmpleado;
    }
}
