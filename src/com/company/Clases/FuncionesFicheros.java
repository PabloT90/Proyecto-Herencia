package com.company.Clases;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FuncionesFicheros {
    /*
    * Interfaz
    * Nombre: crearFicheroBinario
    * Comentario: Esta función crea un fichero binario en una ruta
    * específica.
    * Cabecera: public int crearFicheroBinario(String direccionFichero)
    * Entrada:
    *   -Cadena direccionFichero
    * Salida:
    *   -entero validez
    * Precondiciones:
    *   -La ruta debe ser correcta.
    * Postcondiciones: La función devuelve un número entero asociado al
    * nombre, 0 si se ha creado el fichero o -1 si el fichero ya existe.
    * */
    public int crearFicheroBinario(String direccionFichero){
        int validez = -1;
        File fichero = new File(direccionFichero);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        if(!fichero.isFile()){//Si el fichero no existe
            validez = 0;
            try{
                fos = new FileOutputStream(fichero);
                oos = new ObjectOutputStream(fos);
            }catch (IOException error){
                error.printStackTrace();
            }finally {
                try{
                    fos.close();
                    oos.close();
                }catch (IOException error){
                    error.printStackTrace();
                }
            }
        }

        return validez;
    }

    /*
    * Interfaz
    * Nombre: ordenarPorPaisYNombre
    * Comentario: Esta función permite ordenar un fichero binario
    * de Campamentos por país y nombre de la organización.
    * Cabecera: public int ordenarPorPaisYNombre(String direccionFichero)
    * Entrada:
    *   -Cadena direccionFichero
    * Salida:
    *   -entero validez
    * Precondiciones:
    *   -el fichero solo debe almacenar objetos del tipo CampamentoImpl.
    * Postcondiciones: La función devuelve un número entero asociado al
    * nombre, 0 si se ha ordenado el fichero de campamentos o -1 si el fichero
    * no existe.
    * */
    public int ordenarPorPaisYNombre(String direccionFichero){
        int validez = -1;
        File fichero = new File(direccionFichero);
        CampamentoImpl[] array = null;

        if(fichero.isFile()){//Si el fichero existe
            volcarFicheroEnArray(direccionFichero);
            Arrays.sort(array);//Ordenará el array sacendentemente teniendo en cuenta la función compareTo de la clase OrganizacionImpl.
            volcarArrayEnFichero(array, direccionFichero);
        }

        return validez;
    }

    /*
    * Interfaz
    * Nombre: volcarFicheroEnArray
    * Comentario: Esta función permite volcar los datos de un fichero
    * en un array.
    * Cabecera: public <T> T[] volcarFicheroEnArray(String direccionFichero)
    * Entrada:
    *   -Cadena direccionFichero
    * Salida:
    *   -T[] array
    * Precondiciones:
    *   -el fichero debe existir.
    *   -la estructura del fichero debe ser igual al tipo array introducido por parametros.
    * Postcondiciones: La función devuelve un array del tipo <T> asociado al nombre. Que
    * contiene los datos del fichero.
    * */
    public <T> T[] volcarFicheroEnArray(String direccionFichero){
        T[] array = (T[]) Array.newInstance(CampamentoImpl, numeroRegistrosFichero(direccionFichero));
        //T[] array = (T[]) new Object[numeroRegistrosFichero(direccionFichero)];
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(direccionFichero);//Volcamos los datos del archivo en el array.
            ois = new ObjectInputStream(fis);
            System.out.println(array.length);
            for(int i = 0; i < array.length; i++){
                array[i] = (T) ois.readObject();
                System.out.println(array[i].toString());
            }
        }catch (FileNotFoundException error1){
            error1.printStackTrace();
        }catch (IOException error2){
            error2.printStackTrace();
        }catch (ClassNotFoundException error3){
            error3.printStackTrace();
        }finally {
            try {
                ois.close();
                fis.close();
            }catch (IOException error){
                error.printStackTrace();
            }
        }
        return array;
    }

    /*
    * Interfaz
    * Nombre: volcarArrayEnFichero
    * Comentario: Esta función permite volcar los datos de un array
    * en un fichero. Se sobreescribe la información que contuviera el
    * fichero.
    * Cabecera: public <T> void volcarArrayEnFichero(T[] array, String direccionFichero)
    * Entrada:
    *   -T[] array
    *   -Cadena direccionFichero
    * Postcondiciones: La función vuelca los datos de un array en el fichero.
    * */
    public <T> void volcarArrayEnFichero(T[] array, String direccionFichero){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(direccionFichero);
            oos = new ObjectOutputStream(fos);
            for(int i = 0; i < array.length; i++){
                oos.writeObject(array[i]);
            }
        }catch (FileNotFoundException error1){
            error1.printStackTrace();
        }catch (IOException error2){
            error2.printStackTrace();
        }finally {
            try{
                oos.close();
                fos.close();
            }catch (IOException error){
                error.printStackTrace();
            }
        }
    }

    /*
     * Interfaz
     * Nombre: numeroRegistrosFichero
     * Comentario: Esta función permite obtener el número de registros almacenados en
     * un fichero binario.
     * Cabecera: public int numeroRegistrosFichero(String direccionFichero)
     * Entrada:
     *   -Cadena direccionFichero //Es la dirección(Path) del fichero.
     * Salida:
     *   -entero numeroRegistros
     * Postcondiciones: La función devuelve un número entero asociado al nombre,
     * que es el número de registros que almacena el fichero.
     * Si alguna dirección de fichero es erronea o no existe, se lanzará la excepción FileNotFoundException.
     * Si ocurre algún error durante la salida de datos se lanzará IOException.
     * Si se llega a final de fichero se lanzará EOFExepcion.
     * Si no se encuentra la clase de un objeto serializado se lanzará ClassNotFoundException.
     *
     * */
    /**
     * Obtiene el número de registros de un fichero.
     * @param direccionFichero Path del fichero.
     * @return Número de registros del fichero.
     * @throws FileNotFoundException en caso de no encontrar un archivo.
     * @throws EOFException al llegar al fin de fichero.
     * @throws IOException al ocurrir un error durante la salida de datos.
     * @throws ClassNotFoundException si no se encuentra la clase de un objeto serializado.
     */
    public int numeroRegistrosFichero(String direccionFichero) {
        int numeroRegistros = 0;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(direccionFichero);
            ois = new ObjectInputStream(fis);

            while (true) {
                ois.readObject();
                numeroRegistros++;  //Incrementamos numeroRegistros
            }
        }catch (ClassNotFoundException error3){
            error3.printStackTrace();
        }catch(FileNotFoundException error1) {
            error1.printStackTrace();
        }catch (EOFException error){
        }catch (IOException error2){
            error2.printStackTrace();
        }finally {
            try{
                if(ois != null) {
                    ois.close();
                }
                fis.close();

            }catch (IOException error1){
                error1.printStackTrace();
            }
        }
        return numeroRegistros;
    }
}
