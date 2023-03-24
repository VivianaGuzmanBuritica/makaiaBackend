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
 private Double total;

 @OneToOne
 @JoinColumn(name = "numero")
 private Habitacion habitacion;

 @ManyToOne
 @JoinColumn(name = "cedula")
 private Cliente cliente;

 public Reserva() {
 }

 public Reserva(String fecha, Double total, Cliente cliente, Habitacion habitacion) {
  this.fecha = fecha;
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

 public Double getTotal() {
  return total;
 }

 public void setTotal(Double total) {
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
