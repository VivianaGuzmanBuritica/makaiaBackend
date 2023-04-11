package com.example.integradorSpring.Model;

public class Paquete {
    private Integer id;

    private String tipo;
    private double peso;
    private double valorDeclarado;

    public Paquete(Integer id, String tipo, double peso, double valorDeclarado) {
        this.id = id;
        this.tipo = tipo;
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "id="  + id +",  tipo='" + tipo + '\'' +
                ", peso=" + peso +
                ", valorDeclarado=" + valorDeclarado +
                '}';
    }
}
