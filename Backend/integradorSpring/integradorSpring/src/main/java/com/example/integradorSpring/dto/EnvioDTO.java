package com.example.integradorSpring.dto;


public class EnvioDTO {
    private Integer cedulaCliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private  String dirDestino;
    private String nombreRecibe;
    private String celularRecibe;
    private double peso;
    private double valorDeclarado;

    public EnvioDTO(Integer cedulaCliente, String ciudadOrigen, String ciudadDestino, String dirDestino, String nombreRecibe, String celularRecibe, double peso, double valorDeclarado) {
        this.cedulaCliente = cedulaCliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.dirDestino = dirDestino;
        this.nombreRecibe = nombreRecibe;
        this.celularRecibe = celularRecibe;
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
    }

    public EnvioDTO() {
    }

    public Integer getCedulaCliente() {
        return cedulaCliente;
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

    public double getPeso() {
        return peso;
    }


    public double getValorDeclarado() {
        return valorDeclarado;
    }


}
