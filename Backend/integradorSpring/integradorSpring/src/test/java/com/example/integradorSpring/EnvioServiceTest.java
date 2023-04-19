package com.example.integradorSpring;

import com.example.integradorSpring.Model.Empleado;
import com.example.integradorSpring.Service.EnvioService;
import com.example.integradorSpring.Service.EstadoEnvio;
import com.example.integradorSpring.Service.PaqueteService;
import com.example.integradorSpring.Service.patronState.Estado;
import com.example.integradorSpring.dto.ClienteDTO;
import com.example.integradorSpring.dto.EnvioCreadoDTO;
import com.example.integradorSpring.dto.EnvioDTO;
import com.example.integradorSpring.exception.ApiRequestException;
import com.example.integradorSpring.repository.ClienteRepository;
import com.example.integradorSpring.repository.EmpleadoRepesitory;
import com.example.integradorSpring.repository.EnvioRepository;
import com.example.integradorSpring.repository.PaqueteRepository;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class EnvioServiceTest {

    EnvioService envioService;
    EstadoEnvio estadoEnvio;
    PaqueteService paqueteService;


    ClienteRepository clienteRepository;
    EnvioRepository envioRepository;
    EmpleadoRepesitory empleadoRepesitory;

    PaqueteRepository paqueteRepository;

    @Before
    public void setUp(){
        this.envioRepository = mock(EnvioRepository.class);
        this.envioService = new EnvioService(paqueteService, empleadoRepesitory, envioRepository, paqueteRepository, clienteRepository);
    }

    @Test(expected = ApiRequestException.class)
    public void crearEnvioNulo(){
        //Arrange
        EnvioDTO envioDTO = new EnvioDTO(null, null, null, null, null, null, 0, 0);
        //Act&Assert
        envioService.crear(envioDTO);
    }

}
