package com.company.Tests;

import com.company.Clases.CampamentoImpl;
import com.company.Clases.FuncionesFicheros;

public class TestFuncionesFicheros {
    public static void main (String [] args){
        FuncionesFicheros funcion = new FuncionesFicheros();
        CampamentoImpl[] array = null;

        //crearFicheroBinario
        System.out.println(funcion.crearFicheroBinario("Prueba.dat"));

        //volcarFicheroEnArray
        array = funcion.volcarFicheroEnArray("Prueba.dat");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].toString());
        }
    }
}
