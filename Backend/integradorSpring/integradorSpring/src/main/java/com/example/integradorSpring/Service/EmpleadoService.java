package com.example.integradorSpring.Service;

import com.example.integradorSpring.Model.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    private List<Empleado> empleado;

    public  Empleado crear(Empleado empleado){
        return null;
    }
    public List<Empleado> buscar(String cedula) {
        return null;
    }

    public List<Empleado> actualizar(String cedula) {
        return null;
    }

    public boolean eliminar(String cedula) {
        return false;
    }
}
