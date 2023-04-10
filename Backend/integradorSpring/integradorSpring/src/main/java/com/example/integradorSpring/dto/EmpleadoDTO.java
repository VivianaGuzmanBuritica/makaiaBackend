package com.example.integradorSpring.dto;

public class EmpleadoDTO {

    private double antiguedad;
    private String rhSangre;
    private String tipo;

    public EmpleadoDTO(double antiguedad, String rhSangre, String tipo) {
        this.antiguedad = antiguedad;
        this.rhSangre = rhSangre;
        this.tipo = tipo;
    }

    public EmpleadoDTO() {
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public String getRhSangre() {
        return rhSangre;
    }

    public String getTipo() {
        return tipo;
    }
}
