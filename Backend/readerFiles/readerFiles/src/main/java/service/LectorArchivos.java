package service;

import com.reader.readerFiles.Archivo;
import com.reader.readerFiles.Persona;

import java.util.List;

public interface LectorArchivos {

    public List<Persona> leer(Archivo archivo);
}
