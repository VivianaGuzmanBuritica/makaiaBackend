package com.example.workshopreservas.service;

import com.example.workshopreservas.entity.Cliente;
import com.example.workshopreservas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    @Autowired

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente crear(Cliente cliente){
        return clienteRepository.save(cliente);
    }

}
