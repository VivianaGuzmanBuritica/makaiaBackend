package com.example.integradorSpring.Service;

import com.example.integradorSpring.Model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private List<Cliente> clientes;

    public  Cliente crear(Cliente cliente){
        return null;
    }
    public List<Cliente> buscar(String cedula) {
        return null;
    }

    public List<Cliente> actualizar(String cedula) {
        return null;
    }

    public boolean eliminar(String cedula) {
        return false;
    }
}
