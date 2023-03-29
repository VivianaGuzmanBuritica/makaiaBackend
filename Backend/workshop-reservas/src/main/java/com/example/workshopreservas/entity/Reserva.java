package com.example.workshopreservas.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reserva")
public class Reserva {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 //@Column(name = "codigo")
 private Integer codigo;
 @OneToOne
 @JoinColumn(name = "numero")
 private Habitacion habitacion;
 @ManyToOne
 @JoinColumn(name = "cedula")
 private Cliente cliente;
  @Column(name = "fecha")
 private Date fecha;

 @Column(name = "total")
 private Double total;

 public Reserva() {
 }

 public Reserva(Date fecha, Double total, Cliente cliente, Habitacion habitacion) {
  this.fecha = fecha;
  this.total = total;
  this.cliente = cliente;
  this.habitacion = habitacion;
 }

 public Date getFecha() {
  return fecha;
 }

 public void setFecha(Date fecha) {
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
