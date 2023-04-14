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

import java.util.List;
import java.util.Optional;

@Service
public class EnvioService {

    private List<Envio> envios;

    private EnvioRepository envioRepository;
    private PaqueteRepository paqueteRepository;
    private ClienteRepository clienteRepository;

    @Autowired
    public EnvioService(EnvioRepository envioRepository, PaqueteRepository paqueteRepository, ClienteRepository clienteRepository) {
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
                || envioDTO.getPeso() == null
                || envioDTO.getValorDeclarado() == 0
        ){
           throw new RuntimeException("Todos los campos deben ser diligenciados y diferente de nulo o 0");
        }

        else if(!cliente.isPresent()){
            throw new RuntimeException("El cliente debe haberse creado previamente");
        }

        Envio envio = new Envio(
                envioDTO.getCiudadOrigen(),
                envioDTO.getCiudadDestino(),
                envioDTO.getDirDestino(),
                envioDTO.getNombreRecibe(),
                envioDTO.getCelularRecibe(),
                calcularHoraEntrega(),
                calcularEstado(),
                calcularValorEnvio()
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


        return respuestaDTO;
    }

    private Integer generarNumGuia() {
        return 1244;
    }

    public String calcularHoraEntrega(){return "La hora";}
    public String calcularEstado(){return "(RECIBIDO, EN RUTA, ENTREGADO)";}

    public Double calcularValorEnvio(){
        return 1.0;
    }
    public String identificarTipoPaquete (){return "LIVIANO, MEDIANO, GRANDE";}
    public List<Envio> filtar(String estado){ return null;}
}

