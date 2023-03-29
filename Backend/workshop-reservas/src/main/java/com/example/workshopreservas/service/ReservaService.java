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
     public Reserva reservar(Integer cedula, Integer numero, String fechaString){

        Optional<Cliente> cliente = this.clienteRepository.findById(cedula);
        Optional<Habitacion> habitacion = this.habitacionRepository.findById(numero);

         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

         try {
             Date fecha = sdf.parse(fechaString);
             System.out.println("Fecha parseada: " + fecha);

             if(cliente.isPresent() && habitacion.get().tipo.equals("premium")){

                 Double precioBase = habitacion.get().precioBase.doubleValue();
                 Double total = precioBase+(precioBase * 0.05);

                 Reserva reserva = new Reserva(fecha, total, cliente.get(), habitacion.get());
                 return this.reservaRepository.save(reserva);
             }else if (cliente.isPresent() && habitacion.get().tipo.equals("estandar") && disponibilidad(fecha)){
                 Reserva reserva = new Reserva(fecha, habitacion.get().precioBase , cliente.get(), habitacion.get());
                 return this.reservaRepository.save(reserva);
             }else{
                 return null;
             }
         } catch (ParseException e) {
             e.printStackTrace();
         }
        return null;

     }

    public Boolean disponibilidad(Date fecha){

    //boolean disponibles = this.reservaRepository.disponibilidad(fecha);


       Date fechaActual = new Date();
      //"compareTo : Este método devuelve un valor negativo si la fecha actual es anterior a la fecha proporcionada -------La fecha es posterior a la fechaActual devuelve ----- "
        if(  fecha.compareTo(fechaActual)  > 0) {
           return true;
       }
       return false;

    }


}



//    public List<Room> roomsByDate(LocalDate date){
//        List<Reservation> reservations = research();
//        List<Room> roomList = new ArrayList<>();
//
//        List<Reservation> reservationBasic = reservations.stream()
//                .filter(reservation -> reservation.getRoom() != null && reservation.getReserveDate().equals(date))
//                .collect(Collectors.toList());
//        reservationBasic.stream().forEach(reservation -> {
//            Optional<Room> auxRoom = roomService.researchById(reservation.getRoom().getNumberRoom());
//            roomList.add(auxRoom.get());
//        });
//        return roomList;
//    }