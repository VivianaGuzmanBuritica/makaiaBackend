package com.example.integradorSpring.Service;
import com.example.integradorSpring.dto.EmpleadoDTO;
import com.example.integradorSpring.entity.Cliente;
import com.example.integradorSpring.entity.Empleado;
import com.example.integradorSpring.repository.EmpleadoRepesitory;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public EmpleadoDTO buscar(Integer cedula) {

        if(cedula == null){
            throw new RuntimeException("El cliente debe haberse creado previamente");}

        Optional<Empleado> empleado = empleadoRepesitory.findById(cedula);

        EmpleadoDTO empleadoDTO = new EmpleadoDTO(
                empleado.get().getCedula(),
                empleado.get().getNombre(),
                empleado.get().getApellido(),
                empleado.get().getCelular(),
                empleado.get().getEmail(),
                empleado.get().getDirResidencia(),
                empleado.get().getCiudad(),
                empleado.get().getAntigueadad(),
                empleado.get().getRhSangre(),
                empleado.get().getTipo()
        );
        return  empleadoDTO;

    }

    public EmpleadoDTO actualizar(Integer cedula, EmpleadoDTO empleadoActualizado)
    {
        Optional<Empleado> empleadoActual = empleadoRepesitory.findById(cedula);

        Empleado empleado = empleadoActual.get();
        empleadoActual.get().setAntigueadad(empleadoActualizado.getAntiguedad());
        empleadoActual.get().setApellido(empleadoActualizado.getApellido());
        empleadoActual.get().setCelular(empleadoActualizado.getCelular());
        empleadoActual.get().setCiudad(empleadoActualizado.getCiudad());
        empleadoActual.get().setEmail(empleadoActualizado.getEmail());
        empleadoActual.get().setDirResidencia(empleadoActualizado.getDirResidencia());
        empleadoActual.get().setNombre(empleadoActualizado.getNombre());
        empleadoActual.get().setRhSangre(empleadoActualizado.getRhSangre());
        empleadoActual.get().setTipo(empleadoActualizado.getTipo());

        empleadoRepesitory.save(empleado);

        EmpleadoDTO empleadoDTO = new EmpleadoDTO(
                empleadoActual.get().getCedula(),
                empleadoActual.get().getNombre(),
                empleadoActual.get().getApellido(),
                empleadoActual.get().getCelular(),
                empleadoActual.get().getEmail(),
                empleadoActual.get().getDirResidencia(),
                empleadoActual.get().getCiudad(),
                empleadoActual.get().getAntigueadad(),
                empleadoActual.get().getRhSangre(),
                empleadoActual.get().getTipo()
        );
        return  empleadoDTO;

    }

    public boolean eliminar(Integer cedula) {

        Optional<Empleado> empleado = empleadoRepesitory.findById(cedula);

        if(empleado.isPresent()){
        Empleado empleadoEncontrado = empleado.get();
        empleadoRepesitory.delete(empleadoEncontrado);
        return true;
        }
        return false;
    }
}
