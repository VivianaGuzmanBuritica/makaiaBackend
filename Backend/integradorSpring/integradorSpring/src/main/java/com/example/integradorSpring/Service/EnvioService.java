package com.example.integradorSpring.Service;


import com.example.integradorSpring.dto.*;
import com.example.integradorSpring.entity.Cliente;
import com.example.integradorSpring.entity.Empleado;
import com.example.integradorSpring.entity.Envio;

import com.example.integradorSpring.entity.Paquete;
import com.example.integradorSpring.repository.ClienteRepository;
import com.example.integradorSpring.repository.EmpleadoRepesitory;
import com.example.integradorSpring.repository.EnvioRepository;
import com.example.integradorSpring.repository.PaqueteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EnvioService {
    private List<Envio> envios;
    private EnvioRepository envioRepository;
    private PaqueteRepository paqueteRepository;
    private ClienteRepository clienteRepository;
    private EmpleadoRepesitory empleadoRepesitory;
    private  PaqueteService paqueteService;

    private EnvioEstadoDTO envioEstadoDTO = new EnvioEstadoDTO();



    @Autowired
    public EnvioService(  PaqueteService paqueteService,EmpleadoRepesitory empleadoRepesitory,  EnvioRepository envioRepository, PaqueteRepository paqueteRepository, ClienteRepository clienteRepository) {

        this.empleadoRepesitory = empleadoRepesitory;
        this.paqueteService = paqueteService;
        this.envioRepository = envioRepository;
        this.paqueteRepository = paqueteRepository;
        this.clienteRepository = clienteRepository;
        this.envios = new ArrayList<>();
    }

    public EnvioCreadoDTO crear(EnvioDTO envioDTO){

        Optional<Cliente> cliente = this.clienteRepository.findById(envioDTO.getCedulaCliente());
        String estado =  envioEstadoDTO.getEstadoInicial();
        System.out.println("PATRON STATE DTO "+estado);

        if(envioDTO.getCedulaCliente() == null
                || envioDTO.getCiudadOrigen() == null
                || envioDTO.getCiudadDestino() == null
                || envioDTO.getDirDestino() == null
                || envioDTO.getNombreRecibe() == null
                || envioDTO.getCelularRecibe() == null
                || envioDTO.getPeso() == 0
                || envioDTO.getValorDeclarado() == 0
        ){
           throw new RuntimeException("Todos los campos deben ser diligenciados y diferente de nulo o 0");
        }

        else if(!cliente.isPresent()){
            throw new RuntimeException("El cliente debe haberse creado previamente");
        }

        String tipo = paqueteService.identificarTipoPaquete(envioDTO.getPeso());
       double valor = com.example.integradorSpring.Model.Envio.calcularValorEnvio(tipo);


        Paquete paquete = new Paquete(
                tipo,
                envioDTO.getPeso(),
                envioDTO.getValorDeclarado()
        );

        paqueteRepository.save(paquete);

        Envio envio = new Envio(
                envioDTO.getCiudadOrigen(),
                envioDTO.getCiudadDestino(),
                envioDTO.getDirDestino(),
                envioDTO.getNombreRecibe(),
                envioDTO.getCelularRecibe(),
                calcularHoraEntrega(),
                estado,
                valor,
                cliente.get(),
                paquete


        );
        envioRepository.save(envio);

        EnvioCreadoDTO respuestaDTO = new EnvioCreadoDTO(
                envio.getNumGuia(),
                envio.getEstado()
        );


      return respuestaDTO;
    }

    public String calcularHoraEntrega(){

        LocalDateTime horaLocal = LocalDateTime.now();
        LocalDateTime horaEntrega =  horaLocal.plusHours(72);
        DateTimeFormatter horaFormateada = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");

        String hora = horaFormateada.toString();
        System.out.println("la hora inicial "+horaLocal + "  ENTREGA  "+ horaEntrega);
        return hora;
    }

    public EnvioCreadoDTO cambiarEstado(EnvioCambiarEstadoDTO envioCambiarEstadoDTO){

        Optional<Envio> envioPorId = this.envioRepository.findById(envioCambiarEstadoDTO.getNumGuia());
        Optional<Empleado> empleadoPorId = this.empleadoRepesitory.findById(envioCambiarEstadoDTO.getCedulaEmpleado());

        if(!empleadoPorId.isPresent()){
            throw new RuntimeException("el empleado con  cedula "+ envioCambiarEstadoDTO.getCedulaEmpleado() +" no existe en nuestra compania");
        }

        if(empleadoPorId.get().getTipo().equals("REPARTIDOR") || empleadoPorId.get().getTipo().equals("COORDINADOR")){
            String estadoActual = envioPorId.get().getEstado();
            System.out.println(" estado actual "+estadoActual);

            // persistencia de datos.... update a la entity ....envioRepository.findById(envioCambiarEstadoDTO.getNumGuia()).stream().
            envioPorId.get().setEstado(envioEstadoDTO.cambiarEstado());

            System.out.println("estado actualizado ? : "+  envioPorId.get().getEstado());


            EnvioCreadoDTO respuestaDTO = new EnvioCreadoDTO(
                    envioPorId.get().getNumGuia(),
                    envioPorId.get().getEstado()
            );

            return respuestaDTO ;

        }

    return null;

    }

  public  EnvioDetalleDTO buscar(Integer numGuia){

        if(numGuia == null){
            throw new RuntimeException("El cliente debe haberse creado previamente");}

    Optional<Envio> envio = envioRepository.findById(numGuia);
        System.out.println("envio encontrado detalle"+ envio.toString());

      EnvioDetalleDTO envioDetalleDTO = new EnvioDetalleDTO(
            envio.get().getNumGuia(),
            envio.get().getCiudadOrigen(),
            envio.get().getCiudadDestino(),
            envio.get().getDirDestino(),
            envio.get().getNombreRecibe(),
            envio.get().getCelularRecibe(),
            envio.get().getValorEnvio(),
            envio.get().getValorDeclarado(),
            envio.get().getPeso(),
            envio.get().getCedulaCliente(),
            envio.get().getNombreCliente()
//            envio.get().getPaquete().getValorDeclarado(),
//            envio.get().getPaquete().getPeso(),
//            envio.get().getCliente().getCedula(),
//            envio.get() .getCliente().getNombre()

      );

        return  envioDetalleDTO;
    }

    public List<Envio> filtar(String estado){ return null;}
}

