package com.reader.readerFiles;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class LectorArchivoCsv {

    public List<Persona> leer(Archivo archivo) {

       String ruta = archivo.getRuta();
       String tipo = archivo.getTipo();

       List <Persona> personas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String line;
            while((line = br.readLine()) != null){
                String[] lineas =  line.split(",");
                Persona persona = new Persona(lineas[0], lineas[1], lineas[2], lineas[3], lineas[4], lineas[5], lineas[6], lineas[7], lineas[8]);
                personas.add(persona);
            }
        } catch (Exception e){
            System.out.println(e);
        }

        return personas;


    }


}
