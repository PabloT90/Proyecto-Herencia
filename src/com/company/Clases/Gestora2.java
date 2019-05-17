package com.company.Clases;

import java.io.*;

public class Gestora2 {
    /*
     * Muestra los campos segun una calificacion recibida como parametro.
     * Entrada:
     *   - char calificacion.
     *   - String pais
     * Precondiciones: el fichero debe estar creado. Es decir, que es en la ruta especificada exista.
     * Postcondiciones: nada, solo muestra en pantalla.
     * Cabecera: public void camposSegunCalificacion(char calificacion, String ruta)
     * */
    public void camposSegunCalificacion(char calificacion, String ruta){
        CampamentoImpl camp;
        ObjectInputStream ois = null;

        try{
            ois = new ObjectInputStream(new FileInputStream(ruta));

            camp = (CampamentoImpl) ois.readObject();
            while(camp != null) {
                if (camp.getCalificacion() == calificacion) {
                    System.out.println(camp.toString());
                }
                camp = (CampamentoImpl) ois.readObject();
            }
        }catch(FileNotFoundException error1){
            error1.printStackTrace();
        }catch (EOFException error){
        }catch (IOException error2){
            error2.printStackTrace();
        }catch(ClassNotFoundException error3){
            error3.printStackTrace();
        }finally{
            try{
                ois.close();
            }catch (IOException error){
                error.printStackTrace();
            }
        }
    }

    /*
     * Muestra los campos en guerra y lso paises al que pertenecen.
     * Entrada:
     *   - String ruta.
     * Precondiciones: el fichero debe estar creado. Es decir, que es en la ruta especificada exista.
     * Postcondiciones: nada, solo muestra en pantalla.
     * Cabecera: public void camposEnGuerra(String ruta)
     * */
    public void camposEnGuerra(String ruta){
        CampamentoImpl camp;
        ObjectInputStream ois = null;

        try{
            ois = new ObjectInputStream(new FileInputStream(ruta));

            camp = (CampamentoImpl) ois.readObject();
            while(camp != null) {
                if (camp.getGuerra() == 's') {
                    System.out.println(camp.toString() + " Pais: "+ camp.getPais());
                }
                camp = (CampamentoImpl) ois.readObject();
            }
        }catch(FileNotFoundException error1){
            error1.printStackTrace();
        }catch (EOFException error){
        }catch (IOException error2){
            error2.printStackTrace();
        }catch(ClassNotFoundException error3){
            error3.printStackTrace();
        }finally{
            try{
                ois.close();
            }catch (IOException error){
                error.printStackTrace();
            }
        }
    }

    /*
    * Muestra el total de voluntarios segun un pais recibido como parametro.
    * Entrada:
    *   - String ruta.
    *   - String pais
    * Precondiciones: el fichero debe estar creado. Es decir, que es en la ruta especificada exista.
    * Postcondiciones: nada, solo muestra en pantalla.
    * Cabecera: public void totalVoluntarios(String ruta, String pais)
    * */
    public void totalVoluntarios(String ruta, String pais){
        CampamentoImpl camp;
        ObjectInputStream ois = null;
        int numVoluntarios = 0;
        try{
            ois = new ObjectInputStream(new FileInputStream(ruta));

            camp = (CampamentoImpl) ois.readObject();
            while(camp != null) {
                if (camp.getPais() == pais) {
                    numVoluntarios += numVoluntarios;
                }
                camp = (CampamentoImpl) ois.readObject();
            }
            System.out.println("Numero de voluntarios: "+ numVoluntarios);
        }catch(FileNotFoundException error1){
            error1.printStackTrace();
        }catch (EOFException error){
        }catch (IOException error2){
            error2.printStackTrace();
        }catch(ClassNotFoundException error3){
            error3.printStackTrace();
        }finally{
            try{
                ois.close();
            }catch (IOException error){
                error.printStackTrace();
            }
        }
    }

}
