package service;

import model.Archivo;
import model.Persona;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectorArchivoCsv implements LectorArchivos {
    @Override
    public List<Persona> leer(Archivo archivo) {

       String ruta = archivo.getRuta();
       String tipo = archivo.getTipo();

       List <Persona> personas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String line;
            while((line = br.readLine()) != null){
                //line = //5f10e9D33fC5f2b,	Sara,	Mcguire,	Female,	tsharpexample.net,	(971)643-6089x9160,	8/17/1921,	Editor, commissioning
                String[] lineas =  line.split(",");
                //[5f10e9D33fC5f2b] [Sara] [Mcguire] [Female] [	tsharpexample.net]
                //    0                1        2         3            4
                System.out.println("vector "+lineas);
                String cadena = Arrays.toString(lineas);
                System.out.println("cadena "+cadena);

                //Arrays.toString(vector) para transfoma de vector a string, y me lo eciba el constructo de persona

//                Persona persona = new Persona(Arrays.toString(lineas[1]), lineas[2], lineas[3] )..;
//                personas.add(persona);

            }
        } catch (Exception e){
            System.out.println(e);
        }
        return personas;

    }
}
