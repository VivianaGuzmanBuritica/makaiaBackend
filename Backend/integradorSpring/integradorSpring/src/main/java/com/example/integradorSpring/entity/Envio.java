package com.example.integradorSpring.entity;

import com.example.integradorSpring.dto.ClienteDTO;
import com.example.integradorSpring.dto.PaqueteDTO;
import io.swagger.annotations.ApiModel;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;


@Entity
@Table(name = "envio")
@ApiModel(description = "Entidad que representa un envio")
public class Envio {
    @Id
    @Column( nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numGuia;


    @Column(name = "ciudadOrigen")
    private String ciudadOrigen;
    @Column(name = "ciudadDestino")
    private String ciudadDestino;
    @Column(name = "dirDestino")
    private  String dirDestino;
    @Column(name = "nombreRecibe")
    private String nombreRecibe;
    @Column(name = "celularRecibe")
    private String celularRecibe;
    @Column(name = "horaEntrega")
    private String horaEntrega;
    @Column(name = "estado")
    private String estado;
    @Column(name = "valorEnvio")
    private double valorEnvio;

    @OneToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "paquete")
    private Cliente paquete;



    public Envio() {
    }

    public Envio( String ciudadOrigen, String ciudadDestino, String dirDestino, String nombreRecibe, String celularRecibe, String horaEntrega, String estado, double valorEnvio) {

        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.dirDestino = dirDestino;
        this.nombreRecibe = nombreRecibe;
        this.celularRecibe = celularRecibe;
        this.horaEntrega = horaEntrega;
        this.estado = estado;
        this.valorEnvio = valorEnvio;
    }

    public Integer getNumGuia() {
        return numGuia;
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
}