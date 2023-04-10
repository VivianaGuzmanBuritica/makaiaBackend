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
    public List<Empleado> buscar(Integer cedula) {
        return null;
    }

    public List<Empleado> actualizar(Integer cedula) {
        return null;
    }

    public boolean eliminar(Integer cedula) {
        return false;
    }
}
