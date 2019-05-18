package com.company.Tests;

import Clases.MyObjectOutputStream;
import com.company.Clases.CampamentoImpl;
import com.company.Clases.FuncionesFicheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFuncionesFicheros {
    public static void main (String [] args){
        FuncionesFicheros funcion = new FuncionesFicheros();
        CampamentoImpl[] array = null;

        //crearFicheroBinario
        System.out.println(funcion.crearFicheroBinario("Prueba.dat"));

        //Insertamos un par de campamentos en el fichero
        CampamentoImpl c1 = new CampamentoImpl("Angola","Tartulia", 1, 1,'O','N');
        CampamentoImpl c2 = new CampamentoImpl("Afghan","King", 39, 7,'I','P');

        FileOutputStream fos = null;
        Clases.MyObjectOutputStream moos = null;
        try{
            fos = new FileOutputStream("Prueba.dat", true);
            moos = new MyObjectOutputStream(fos);
            moos.writeObject(c1);
            moos.writeObject(c2);
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
        array = funcion.volcarFicheroEnArray("Prueba.dat");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].toString());
        }

        //numeroRegistrosFichero
        System.out.println(funcion.numeroRegistrosFichero("Prueba.dat"));

        //mostrarFichero
        funcion.mostrarFichero("Prueba.dat");
    }
}
