package com.example.workshopreservas.service;

import com.example.workshopreservas.dto.ClienteDTO;
import com.example.workshopreservas.entity.Cliente;
import com.example.workshopreservas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

        public ClienteDTO crear(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente(
                clienteDTO.getCedula(),
                clienteDTO.getNombre(),
                clienteDTO.getApellido(),
                clienteDTO.getDireccion(),
                clienteDTO.getEdad(),
                clienteDTO.getEmail()

        );
        clienteRepository.save(cliente);
        return clienteDTO;
    }

   // public List<ClienteDTO> obtenerUsuarios() {
       // return this.clienteRepository.findAll().stre
//                .stream().map(
//                cliente -> new ClienteDTO(
//                        cliente.getNombre(),
//
//
//                )
//        )
    //    return null;
  //  }

}
