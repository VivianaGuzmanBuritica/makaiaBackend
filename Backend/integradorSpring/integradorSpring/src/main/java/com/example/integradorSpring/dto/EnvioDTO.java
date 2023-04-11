package com.example.integradorSpring.dto;


public class EnvioDTO {

    private String umGuia;
    private ClienteDTO cliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private  String dirDestino;
    private String nombreRecibe;
    private String celularRecibe;
    private String horaEntrega;
    private String estado;
    private double valorEnvio;
    private PaqueteDTO paquete;

    public EnvioDTO(String umGuia, ClienteDTO cliente, String ciudadOrigen, String ciudadDestino, String dirDestino, String nombreRecibe, String celularRecibe, String horaEntrega, String estado, double valorEnvio, PaqueteDTO paquete) {
        this.umGuia = umGuia;
        this.cliente = cliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.dirDestino = dirDestino;
        this.nombreRecibe = nombreRecibe;
        this.celularRecibe = celularRecibe;
        this.horaEntrega = horaEntrega;
        this.estado = estado;
        this.valorEnvio = valorEnvio;
        this.paquete = paquete;
    }

    public EnvioDTO() {
    }

    public String getUmGuia() {
        return umGuia;
    }

    public ClienteDTO getCliente() {
        return cliente;
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

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public double getValorEnvio() {
        return valorEnvio;
    }

    public PaqueteDTO getPaquete() {
        return paquete;
    }
}
