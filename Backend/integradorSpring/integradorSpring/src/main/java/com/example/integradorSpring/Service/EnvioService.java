package com.example.integradorSpring.Service;


import com.example.integradorSpring.dto.EnvioDTO;
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

    public EnvioDTO crear(Integer cedula, Integer id, EnvioDTO envioDTO){

        Optional<Cliente> cliente = this.clienteRepository.findById(cedula);
        Optional<Paquete> paquete = this.paqueteRepository.findById(id);

        Envio envio = new Envio(
                cliente.get(),
                envioDTO.getCiudadOrigen(),
                envioDTO.getCiudadDestino(),
                envioDTO.getDirDestino(),
                envioDTO.getNombreRecibe(),
                envioDTO.getCelularRecibe(),
                envioDTO.getHoraEntrega(),
                envioDTO.getEstado(),
                envioDTO.getValorEnvio(),
                paquete.get()
        );
        envioRepository.save(envio);
        return envioDTO;
    }

    public List<Envio> filtar(String estado){ return null;}
}
