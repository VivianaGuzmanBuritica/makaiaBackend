package com.example.workshopreservas;


import com.example.workshopreservas.dto.ClienteDTO;
import com.example.workshopreservas.dto.HabitacionDTO;
import com.example.workshopreservas.dto.ReservaDTO;
import com.example.workshopreservas.entity.Cliente;
import com.example.workshopreservas.entity.Habitacion;
import com.example.workshopreservas.entity.Reserva;
import com.example.workshopreservas.exception.ApiRequestException;
import com.example.workshopreservas.repository.ClienteRepository;
import com.example.workshopreservas.repository.HabitacionRepository;
import com.example.workshopreservas.repository.ReservaRepository;
import com.example.workshopreservas.service.ReservaService;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReservaServiceTest {

    private ReservaRepository  reservaRepository;
    private ReservaService reservaService;
    private HabitacionRepository habitacionRepository;
    private ClienteRepository clienteRepository;



    @Before
    public void Setup(){
        this.reservaRepository = mock(ReservaRepository.class);
        this.habitacionRepository = mock(HabitacionRepository.class);
        this.clienteRepository = mock(ClienteRepository.class);


        this.reservaService = new ReservaService(reservaRepository, habitacionRepository,clienteRepository);

    }

    //Arrange
    //  Habitacion habitacion = new Habitacion(1, "premium", 10000.0);
    //Cliente cliente = new Cliente(1234, "vivi", "guzman", "call-123", 31, "vivi@guzman.com");

    //Act&&Assert

    @Test(expected = RuntimeException.class)
    public void asignarReservaConFechaNula(){
        //Arrange
        Integer cedula = 1234;
        Integer numero = 1;
        String fecha = null;
        //act
        ReservaDTO reserva = this.reservaService.reservar(cedula, numero, fecha);
    }

    @Test(expected = RuntimeException.class)
    public void asignarReservaConHabitacionNula(){
        //Arrange
        Integer cedula = 1234;
        Integer numero = null;
        String fecha = "2023-05-10";
        //act
        ReservaDTO reserva = this.reservaService.reservar(cedula, numero, fecha);
    }


    @Test(expected = RuntimeException.class)
    public void asignarReservaConCedulaNula(){
        //Arrange
        Integer cedula = null;
        Integer numero = 1;
        String fecha = "2023-05-10";
        //act
        ReservaDTO reserva = this.reservaService.reservar(cedula, numero, fecha);
    }


    @Test
    public void reservar(){
        //Arrange
        Integer cedula = 1234;
        Integer numero = 1;
        String fecha = "2023-05-10";

        Habitacion habitacion = new Habitacion(1, "estandar", 10000.0);
        when(habitacionRepository.findById(any())).thenReturn(Optional.of(habitacion));

        Cliente cliente = new Cliente(1234, "vivi", "guzman", "call-123", 31, "vivi@guzman.com");
        when(clienteRepository.findById(any())).thenReturn(Optional.of(cliente));
        //Act
       ReservaDTO reserva= this.reservaService.reservar(cedula, numero, fecha);
        //Assert
        assertNotNull(reserva.getFecha());
        assertTrue(reserva.getTotal().equals(habitacion.precioBase));
        assertTrue(reserva.getHabitacion().getNumero().equals(numero));
        //assertNotNull(reserva.getCodigo());

//

    }


    @Test(expected = ApiRequestException.class)
    public void fechaDeReservaInvalida(){


    }

}
