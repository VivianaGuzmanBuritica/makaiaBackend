package service;

import model.Archivo;
import model.Persona;

import java.util.List;

public interface LectorArchivos {

    public List<Persona> leer(Archivo archivo);
}
