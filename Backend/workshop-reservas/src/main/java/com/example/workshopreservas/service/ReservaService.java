package com.example.workshopreservas.service;

import com.example.workshopreservas.entity.Cliente;
import com.example.workshopreservas.entity.Habitacion;
import com.example.workshopreservas.entity.Reserva;
import com.example.workshopreservas.repository.ClienteRepository;
import com.example.workshopreservas.repository.HabitacionRepository;
import com.example.workshopreservas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
     public Reserva reservar(Integer cedula, Integer numero, String fecha){

        Optional<Cliente> cliente = this.clienteRepository.findById(cedula);
        Optional<Habitacion> habitacion = this.habitacionRepository.findById(numero);



        if(cliente.isPresent() && habitacion.get().tipo.equals("premium")){

            Double precioBase = habitacion.get().precioBase.doubleValue();
            Double total = precioBase+(precioBase * 0.05);

            Reserva reserva = new Reserva(fecha, total, cliente.get(), habitacion.get());
            this.reservaRepository.save(reserva);
        }else{
            Reserva reserva = new Reserva(fecha, habitacion.get().precioBase , cliente.get(), habitacion.get());
            this.reservaRepository.save(reserva);
        }
        return new Reserva();
     }

}
