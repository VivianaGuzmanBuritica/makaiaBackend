package com.example.integradorSpring.Service;
import com.example.integradorSpring.dto.EmpleadoDTO;
import com.example.integradorSpring.entity.Cliente;
import com.example.integradorSpring.entity.Empleado;
import com.example.integradorSpring.repository.EmpleadoRepesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    private EmpleadoRepesitory empleadoRepesitory;

    private List<Empleado> empleado;
    @Autowired
    public EmpleadoService(EmpleadoRepesitory empleadoRepesitory) {
        this.empleadoRepesitory = empleadoRepesitory;
    }

    public EmpleadoDTO crear(EmpleadoDTO empleadoDTO){

        if(empleadoDTO.getCedula() == null  || empleadoDTO.getApellido() == null || empleadoDTO.getNombre() == null){
            throw new RuntimeException("la cedula, el apellido o el nombre son invalidos");
        }
        Empleado empleado = new Empleado(
                empleadoDTO.getCedula(),
                empleadoDTO.getNombre(),
                empleadoDTO.getApellido(),
                empleadoDTO.getCelular(),
                empleadoDTO.getEmail(),
                empleadoDTO.getDirResidencia(),
                empleadoDTO.getCiudad(),
                empleadoDTO.getAntiguedad(),
                empleadoDTO.getRhSangre(),
                empleadoDTO.getTipo()
        );

        empleadoRepesitory.save(empleado);
        return empleadoDTO;

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
