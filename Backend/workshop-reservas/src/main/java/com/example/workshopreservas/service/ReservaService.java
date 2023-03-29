package com.example.workshopreservas.service;

import com.example.workshopreservas.entity.Cliente;
import com.example.workshopreservas.entity.Habitacion;
import com.example.workshopreservas.entity.Reserva;
import com.example.workshopreservas.repository.ClienteRepository;
import com.example.workshopreservas.repository.HabitacionRepository;
import com.example.workshopreservas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReservaService {

    private ReservaRepository reservaRepository;
    private HabitacionRepository habitacionRepository;
    private ClienteRepository clienteRepository;
    @Autowired
    public ReservaService(ReservaRepository reservaRepository, HabitacionRepository habitacionRepository, ClienteRepository clienteRepository) {
        this.reservaRepository = reservaRepository;
        this.habitacionRepository = habitacionRepository;
        this.clienteRepository = clienteRepository;
    }
     public Reserva reservar(Integer cedula, Integer numero, String fechaString){

        Optional<Cliente> cliente = this.clienteRepository.findById(cedula);
        Optional<Habitacion> habitacion = this.habitacionRepository.findById(numero);

         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

         try {
             Date fecha = sdf.parse(fechaString);
             System.out.println("Fecha parseada: " + fecha);

             if(cliente.isPresent() && habitacion.get().tipo.equals("premium") && disponibilidad(fecha, numero)){

                 Double precioBase = habitacion.get().precioBase.doubleValue();
                 Double total = precioBase-(precioBase * 0.05);

                 Reserva reserva = new Reserva(fecha, total, cliente.get(), habitacion.get());
                 return this.reservaRepository.save(reserva);
             }else if (cliente.isPresent() && habitacion.get().tipo.equals("estandar") && disponibilidad(fecha, numero)){
                 Reserva reserva = new Reserva(fecha, habitacion.get().precioBase , cliente.get(), habitacion.get());
                 return this.reservaRepository.save(reserva);
             }
         } catch (ParseException e) {
             e.printStackTrace();
         }
        return null;

     }

    public Boolean disponibilidad(Date fecha, Integer numero){

        Integer resultado = this.reservaRepository.disponibilidadQuery(numero, fecha);

        Date fechaActual = new Date();

        if(  fecha.compareTo(fechaActual) > 0 && resultado == 0) {
             return true;
       }
       return false;

    }

    public List<Object> consultar(Integer cedula, String tipo) {

        Cliente cliente = this.clienteRepository.findById(cedula)
                .orElseThrow(() -> new NoSuchElementException("Cliente no encontrado"));

        return  this.reservaRepository.disponibilidadPorTipo(tipo).stream().collect(Collectors.toList());

        }

}
