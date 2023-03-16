package com.example.numeros;

import java.util.List;
import java.util.stream.Collectors;

public class NumeroService {

    public Integer obtenerTotal(Integer n) {
        /** El numero 13 de la mala suerte
         * Crear un algoritmo que pasado un numero n debe retonar
         * la cantidad de numeros que hay sin contar los que contengan
         * el 13,
         *
         * Ejemplo 1
         * numero = 100
         * numeros a descartar =  13
         * total numeros: 99
         *
         * Ejemplo 2:
         * numero = 1000
         * numeros a descartar =  13, 130...139
         * total numeros: 989
         *
         * Ejemplo 2:
         * numero = 3800
         * numeros a descartar = 13, 130..139 , 1300...1399.
         * total numeros: 3699
         */


     Integer nSin13 = n;
        String  trece = "13" ;

        String numAux;

        for(Integer i = 1; i < nSin13; i++){
            numAux = String.valueOf(i);
            if(numAux.startsWith(trece)){
                nSin13--;
            }
        }
        return nSin13;
//        return  n;
    }
}
