package com.example.integradorSpring;

import com.example.integradorSpring.Model.Empleado;
import com.example.integradorSpring.Service.*;
import com.example.integradorSpring.Service.patronState.Estado;
import com.example.integradorSpring.dto.ClienteDTO;
import com.example.integradorSpring.dto.EnvioCreadoDTO;
import com.example.integradorSpring.dto.EnvioDTO;
import com.example.integradorSpring.dto.EnvioEstadoDTO;
import com.example.integradorSpring.entity.Cliente;
import com.example.integradorSpring.entity.Envio;
import com.example.integradorSpring.entity.Paquete;
import com.example.integradorSpring.exception.ApiRequestException;
import com.example.integradorSpring.repository.ClienteRepository;
import com.example.integradorSpring.repository.EmpleadoRepesitory;
import com.example.integradorSpring.repository.EnvioRepository;
import com.example.integradorSpring.repository.PaqueteRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class EnvioServiceTest {

    EnvioService envioService;
    PaqueteService paqueteService;

    ClienteService clienteService;
    EmpleadoService empleadoService;


    ClienteRepository clienteRepository;
    EnvioRepository envioRepository;
    EmpleadoRepesitory empleadoRepesitory;

    PaqueteRepository paqueteRepository;

    @Before
    public void setUp(){
        this.clienteRepository = mock(ClienteRepository.class);
        this.paqueteRepository = mock(PaqueteRepository.class);
        this.envioRepository = mock(EnvioRepository.class);
        this.empleadoRepesitory = mock(EmpleadoRepesitory.class);

        this.clienteService =new ClienteService(clienteRepository);
        this.empleadoService = new EmpleadoService(empleadoRepesitory);

        this.paqueteService = new PaqueteService(paqueteRepository);
        this.envioService = new EnvioService(paqueteService, empleadoRepesitory, envioRepository, paqueteRepository, clienteRepository);
    }

    @Test(expected = ApiRequestException.class)
    public void testCrearEnvioClienteNoExiste() {
        EnvioDTO envioDTO = new EnvioDTO();
        envioDTO.setCedulaCliente(12345);

        when(clienteRepository.findById(12345)).thenReturn(Optional.empty());

        EnvioCreadoDTO envioCreadoDTO = envioService.crear(envioDTO);
    }

    @Test
    public void crearEnvioTest() {
        // Arrange
        EnvioDTO envioDTO = new EnvioDTO();
        envioDTO.setCedulaCliente(123456789);
        envioDTO.setCiudadOrigen("Bogotá");
        envioDTO.setCiudadDestino("Medellín");
        envioDTO.setDirDestino("Carrera 5 # 10 - 50");
        envioDTO.setNombreRecibe("Juan Perez");
        envioDTO.setCelularRecibe("3111111111");
        envioDTO.setPeso(2);
        envioDTO.setValorDeclarado(50000);

        Cliente cliente = new Cliente();
        cliente.setCedula(123456789);
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setCelular("3222222");
        cliente.setDirResidencia("Calle 10 # 5-50");
        cliente.setEmail("juan@mail.com");
        cliente.setCiudad("cali");

        when(clienteRepository.findById(envioDTO.getCedulaCliente())).thenReturn(Optional.of(cliente));

        Paquete paquete = new Paquete();
        paquete.setTipo("LIVIANO");
        paquete.setPeso(2);
        paquete.setValorDeclarado(50000);

        paqueteService.identificarTipoPaquete(envioDTO.getPeso());
        when(paqueteRepository.save(any(Paquete.class))).thenReturn(paquete);

        // Act
        EnvioCreadoDTO respuestaDTO = envioService.crear(envioDTO);

        // Assert
        assertNotNull(respuestaDTO);

    }

    @Test(expected = ApiRequestException.class)
    public void buscarClienteNoExiste(){
        //Arrange
        EnvioDTO envioDTO = new EnvioDTO();
        envioDTO.setCedulaCliente(123456789);
        envioDTO.setCiudadOrigen("Bogotá");
        envioDTO.setCiudadDestino("Medellín");
        envioDTO.setDirDestino("Carrera 5 # 10 - 50");
        envioDTO.setNombreRecibe("Juan Perez");
        envioDTO.setCelularRecibe("3111111111");
        envioDTO.setPeso(2);
        envioDTO.setValorDeclarado(50000);

        when(clienteRepository.findById(envioDTO.getCedulaCliente())).thenReturn(Optional.empty());
        // Act
        EnvioCreadoDTO respuestaDTO = envioService.crear(envioDTO);
        // Assert
        assertNotNull(respuestaDTO);
    }

    
}
