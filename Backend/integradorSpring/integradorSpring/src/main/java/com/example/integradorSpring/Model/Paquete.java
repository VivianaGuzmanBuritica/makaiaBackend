package com.example.integradorSpring.Model;

public class Paquete {
    private int id;
    public static int generarId = 1;
    private String tipo;
    private double peso;
    private double valorDeclarado;

    public Paquete(String tipo, double peso, double valorDeclarado) {
        this.id = generarId++;
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
