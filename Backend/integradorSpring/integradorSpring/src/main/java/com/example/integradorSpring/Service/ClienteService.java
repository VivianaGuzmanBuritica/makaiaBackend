package com.example.integradorSpring.Service;


import com.example.integradorSpring.dto.ClienteDTO;
import com.example.integradorSpring.entity.Cliente;
import com.example.integradorSpring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private List<Cliente> clientes;

    private ClienteRepository clienteRepository;
    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
        this.clientes = new ArrayList<>();
    }


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
    public ClienteDTO buscar(Integer cedula) {

        if(cedula == null){
        throw new RuntimeException("El cliente debe haberse creado previamente");}

       Optional<Cliente> cliente =  clienteRepository.findById(cedula);

        ClienteDTO clienteDTO = new ClienteDTO(
                cliente.get().getCedula(),
                cliente.get().getNombre(),
                cliente.get().getApellido(),
                cliente.get().getCelular(),
                cliente.get().getEmail(),
                cliente.get().getDirResidencia(),
                cliente.get().getCiudad()
        );
        return clienteDTO;
    }

    public List<Cliente> actualizar(Integer cedula) {
        return null;
    }

    public boolean eliminar(Integer cedula) {
        return false;
    }
}
