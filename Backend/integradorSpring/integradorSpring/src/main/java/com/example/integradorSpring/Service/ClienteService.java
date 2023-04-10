package com.example.integradorSpring.Service;


import com.example.integradorSpring.dto.ClienteDTO;
import com.example.integradorSpring.entity.Cliente;
import com.example.integradorSpring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;
    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    private List<Cliente> clientes;

    public ClienteDTO crear(ClienteDTO clienteDTO){
        if(clienteDTO.getCedula() == null || clienteDTO.getApellido() == null || clienteDTO.getNombre() == null){
            throw new RuntimeException("la cedula, el apellido o el nombre son invalidos");
        }

        Cliente cliente = new Cliente(
                clienteDTO.getCedula(),
                clienteDTO.getNombre(),
                clienteDTO.getApellido(),
                clienteDTO.getCelular(),
                clienteDTO.getEmail(),
                clienteDTO.getDirResidencia(),
                clienteDTO.getCiudad()

        );

        clienteRepository.save(cliente);
        return clienteDTO;
    }
    public List<Cliente> buscar(Integer cedula) {
        return null;
    }

    public List<Cliente> actualizar(Integer cedula) {
        return null;
    }

    public boolean eliminar(Integer cedula) {
        return false;
    }
}
