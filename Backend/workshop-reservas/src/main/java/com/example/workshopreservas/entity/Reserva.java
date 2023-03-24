package com.example.workshopreservas.entity;

import javax.persistence.*;

@Entity
@Table(name = "Reserva")
public class Reserva {


 @Column(name = "fecha")
 private String fecha;

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "codigo")
 private Integer codigo;

 @Column(name = "total")
 private Float total;

 @ManyToOne
 @JoinColumn(name = "cedula")
 private Cliente cliente;

 @OneToOne
 @JoinColumn(name = "numero")
 private Habitacion habitacion;

 public Reserva() {
 }

 public Reserva(String fecha, Integer codigo, Float total, Cliente cliente, Habitacion habitacion) {
  this.fecha = fecha;
  this.codigo = codigo;
  this.total = total;
  this.cliente = cliente;
  this.habitacion = habitacion;
 }

 public String getFecha() {
  return fecha;
 }

 public void setFecha(String fecha) {
  this.fecha = fecha;
 }

 public Integer getCodigo() {
  return codigo;
 }

 public void setCodigo(Integer codigo) {
  this.codigo = codigo;
 }

 public Float getTotal() {
  return total;
 }

 public void setTotal(Float total) {
  this.total = total;
 }

 public Cliente getCliente() {
  return cliente;
 }

 public void setCliente(Cliente cliente) {
  this.cliente = cliente;
 }

 public Habitacion getHabitacion() {
  return habitacion;
 }

 public void setHabitacion(Habitacion habitacion) {
  this.habitacion = habitacion;
 }
}
