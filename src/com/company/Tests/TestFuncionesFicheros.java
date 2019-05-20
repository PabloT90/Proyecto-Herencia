package com.company.Tests;

import Clases.MyObjectOutputStream;
import com.company.Clases.CampamentoImpl;
import com.company.Clases.FuncionesFicheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TestFuncionesFicheros {
    public static void main (String [] args){
        FuncionesFicheros funcion = new FuncionesFicheros();
        CampamentoImpl[] array = null;

        //crearFicheroBinario
        System.out.println(funcion.crearFicheroBinario("Prueba2.dat"));

        //Insertamos un par de campamentos en el fichero
        CampamentoImpl c1 = new CampamentoImpl("Angola","Tartulia", 1, 1,'O','N');
        CampamentoImpl c2 = new CampamentoImpl("Zfghan","King", 39, 7,'I','P');
        CampamentoImpl c3 = new CampamentoImpl("Afghan","Asta", 23, 4,'L','Q');

        FileOutputStream fos = null;
        Clases.MyObjectOutputStream moos = null;
        try{
            fos = new FileOutputStream("Prueba2.dat", true);
            moos = new MyObjectOutputStream(fos);
            moos.writeObject(c1);
            moos.writeObject(c2);
            moos.writeObject(c3);
        }catch (FileNotFoundException error1){
            error1.printStackTrace();
        }catch (IOException error2){
            error2.printStackTrace();
        }finally {
            try{
                moos.close();
                fos.close();
            }catch (IOException error){
                error.printStackTrace();
            }
        }

        //volcarFicheroEnArray
        array = funcion.volcarFicheroEnArray("Prueba2.dat");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].toString());
        }
        System.out.println("Fin volcar fichero en array");

        //numeroRegistrosFichero
        System.out.println(funcion.numeroRegistrosFichero("Prueba2.dat"));
        System.out.println("Fin numeroRegistrosFichero");

        //mostrarFichero
        funcion.mostrarFichero("Prueba2.dat");

        System.out.println();

        Arrays.sort(array);//Ordenamos el array

        //volcarArrayEnFichero
        funcion.volcarArrayEnFichero(array, "Prueba2.dat");
        funcion.mostrarFichero("Prueba2.dat");

        System.out.println();

        //ordenarPorPaisYNombre
        System.out.println(funcion.ordenarPorPaisYNombre("Prueba2.dat"));
        funcion.mostrarFichero("Prueba2.dat");
    }
}
