package com.reader.readerFiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.LectorArchivos;

import java.util.ArrayList;
import java.util.List;

@Service
public class procesadorService {

    private int contadorLineaValida = 0;
    private int contadorLineaInvalida = 0;
    private LectorArchivoCsv lectorArchivo;
    private  ProcesadorArchivo procesadorArchivo;

    @Autowired
    public procesadorService(LectorArchivoCsv lectorArchivo, ProcesadorArchivo procesadorArchivo) {
        this.lectorArchivo = lectorArchivo;
        this.procesadorArchivo = procesadorArchivo;
    }

    public RespuestaArchivo procesa(Archivo archivo){

        List<Persona> personas = this.lectorArchivo.leer(archivo);

        for (Persona persona : personas) {
            Boolean lineaValida = this.procesadorArchivo.procesar(persona);
            if(lineaValida){
                contadorLineaValida++;
            }
            else{
                contadorLineaInvalida++;
            }
        }
        System.out.println(" validas: " + contadorLineaValida + " invalidas: "+contadorLineaInvalida);
        return  new RespuestaArchivo(contadorLineaValida, contadorLineaInvalida);
    }
}
