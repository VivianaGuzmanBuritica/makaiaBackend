package com.example.integradorSpring.dto;

public class PaqueteDTO {
    private Integer id;
    private String tipo;
    private double peso;
    private double valorDeclarado;

    public PaqueteDTO(String tipo, double peso, double valorDeclarado) {
        this.tipo = tipo;
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
    }

    public PaqueteDTO() {
    }

    public Integer getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }
}
