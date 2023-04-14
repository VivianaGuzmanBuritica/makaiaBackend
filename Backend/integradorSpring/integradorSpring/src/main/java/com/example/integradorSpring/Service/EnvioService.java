package com.example.integradorSpring.Service;


import com.example.integradorSpring.dto.EnvioDTO;
import com.example.integradorSpring.dto.EnvioRespuestaDTO;
import com.example.integradorSpring.entity.Cliente;
import com.example.integradorSpring.entity.Envio;
import com.example.integradorSpring.entity.Paquete;
import com.example.integradorSpring.repository.ClienteRepository;
import com.example.integradorSpring.repository.EnvioRepository;
import com.example.integradorSpring.repository.PaqueteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;

@Service
public class EnvioService {

    private List<Envio> envios;

    private EnvioRepository envioRepository;
    private PaqueteRepository paqueteRepository;
    private ClienteRepository clienteRepository;

    private  PaqueteService paqueteService;

    @Autowired
    public EnvioService(PaqueteService paqueteService, EnvioRepository envioRepository, PaqueteRepository paqueteRepository, ClienteRepository clienteRepository) {
        this.paqueteService = paqueteService;
        this.envioRepository = envioRepository;
        this.paqueteRepository = paqueteRepository;
        this.clienteRepository = clienteRepository;
    }

    public EnvioRespuestaDTO crear(EnvioDTO envioDTO){

        Optional<Cliente> cliente = this.clienteRepository.findById(envioDTO.getCedulaCliente());


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
        double valor = calcularValorEnvio(tipo);

        Envio envio = new Envio(
                envioDTO.getCiudadOrigen(),
                envioDTO.getCiudadDestino(),
                envioDTO.getDirDestino(),
                envioDTO.getNombreRecibe(),
                envioDTO.getCelularRecibe(),
                calcularHoraEntrega(),
                calcularEstado(),
                valor
        );
        envioRepository.save(envio);

        EnvioRespuestaDTO respuestaDTO = new EnvioRespuestaDTO(
                envio.getNumGuia(),
                cliente.get().getCedula(),
                cliente.get().getNombre(),
                envio.getCiudadOrigen(),
                envio.getCiudadDestino(),
                envio.getDirDestino(),
                envio.getNombreRecibe(),
                envio.getCelularRecibe(),
                envioDTO.getValorDeclarado(),
                envioDTO.getPeso(),
                envio.getValorEnvio()
        );

        Paquete paquete = new Paquete(
               tipo,
               envioDTO.getPeso(),
               envioDTO.getValorDeclarado()
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

    public String calcularEstado(){return "(RECIBIDO, EN RUTA, ENTREGADO)";}

    public double calcularValorEnvio(String tipo){
       if(tipo.equals("LIVIANO")){
           return 30000;
       }else if(tipo.equals("MEDIANO")){
           return  40000;

       }else if(tipo.equals("GRANDE")){
           return 50000;
       }else {
           throw new RuntimeException("el valor ingresado no pertenece a un tamaño de paquete");
       }
    }

    public List<Envio> filtar(String estado){ return null;}
}

