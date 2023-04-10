package com.example.integradorSpring.dto;

public class ClienteDTO {

    private Integer cedula;

    private String nombre;

    private  String apellido;
    private String celular;
    private String email;
    private  String dirResidencia;
    private String ciudad;

    public ClienteDTO(Integer cedula, String nombre, String apellido, String celular, String email, String dirResidencia, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
        this.dirResidencia = dirResidencia;
        this.ciudad = ciudad;
    }

    public ClienteDTO() {
    }

    public Integer getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getDirResidencia() {
        return dirResidencia;
    }

    public String getCiudad() {
        return ciudad;
    }
}
