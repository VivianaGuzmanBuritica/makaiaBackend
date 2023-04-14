package com.example.integradorSpring.dto;

public class EnvioRespuestaDTO {
    private Integer numGuia;
    private Integer cedulaCliente;
    private String nombreCliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String dirDestino;
    private String nombreRecibe;
    private String celularRecibe;
    private double valorDeclarado;
    private Integer peso;
    private Double valorEnvio;

    public EnvioRespuestaDTO() {
    }

    public EnvioRespuestaDTO(Integer  numGuia, Integer cedulaCliente, String nombreCliente, String ciudadOrigen, String ciudadDestino, String dirDestino, String nombreRecibe, String celularRecibe, double valorDeclarado, Integer peso, Double valorEnvio) {
        this.numGuia = numGuia;
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.dirDestino = dirDestino;
        this.nombreRecibe = nombreRecibe;
        this.celularRecibe = celularRecibe;
        this.valorDeclarado = valorDeclarado;
        this.peso = peso;
        this.valorEnvio = valorEnvio;
    }

    public Integer getNumGuia() {
        return numGuia;
    }

    public Integer getCedulaCliente() {
        return cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public String getDirDestino() {
        return dirDestino;
    }

    public String getNombreRecibe() {
        return nombreRecibe;
    }

    public String getCelularRecibe() {
        return celularRecibe;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public Integer getPeso() {
        return peso;
    }

    public Double getValorEnvio() {
        return valorEnvio;
    }
}
