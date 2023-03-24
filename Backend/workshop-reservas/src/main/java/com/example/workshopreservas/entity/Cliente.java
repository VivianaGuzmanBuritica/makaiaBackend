package com.example.workshopreservas.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "cliente")
public class Cliente {

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Id
    @Column(name = "cedula")
    private Integer cedula;

    @Column(name="direccion")
    private String direccion;

    @Column(name="edad")
    private Integer edad;

    @Column(name="email")
    private String email;

    @OneToOne(mappedBy = "cedula", cascade = CascadeType.ALL)
    private List<Reserva> reservas;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, Integer cedula, String direccion, Integer edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
