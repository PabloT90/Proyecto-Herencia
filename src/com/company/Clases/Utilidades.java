package com.company.Clases;

import java.util.Scanner;

public class Utilidades {

    /*
    * Muestra en pantalla las opciones del menu principal.
    * Postcondiciones: nada, solo muestra en pantalla.
    * Cabecera: public void MostrarMenuPrincipal()
    * */
    public void MostrarMenuPrincipal(){
        System.out.println("1) Calcular internos totales.");
        System.out.println("2) Voluntarios en guerra.");
        System.out.println("3) Campos segun calificacion.");
        System.out.println("4) Listado de campos en guerra y pais.");
        System.out.println("5) Total voluntarios por pais.");
    }

    /*
    * Lee y valida la opcion del menu.
    * Salida: entero opcion
    * Postcondiciones: asociado al nombre devuelve un numero entre 0 y 5.
    * Cabecera: public int leeryValidarOpcion()
    * */
    public int leeryValidarOpcion(){
        int opcion;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Selecciona la opcion del menu:");
            opcion = teclado.nextInt();
        }while(opcion < 0 || opcion > 5);

        return opcion;
    }

    /*
     * Muestra en pantalla las opciones de un submenu.
     * Postcondiciones: nada, solo muestra en pantalla.
     * Cabecera: public void MostrarSubMenu()
     * */
    public void MostrarSubMenu(){
        System.out.println("1) Voluntarios que no estan en guerra");
        System.out.println("2) Voluntarios en guerra.");
    }

    /*
     * Lee y valida la opcion del menu.
     * Salida: entero opcion
     * Postcondiciones: asociado al nombre devuelve un numero entre 0 y 2.
     * Cabecera: public int leeryValidarOpcionSubMenu()
     * */
    public int leeryValidarOpcionSubMenu(){
        int opcion;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Selecciona la opcion del menu:");
            opcion = teclado.nextInt();
        }while(opcion < 0 || opcion > 2);

        return opcion;
    }

    /*
    Interfaz
    Nombre: mostrarFichero
    Comentario: Este subprorgama muestra el fichero completo
    Cabecera: public void mostrarFichero(String ruta)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //La ruta donde se encuentra el fichero
    Salida: No hay
    E/S: No hay
    Postcondiciones: Se muestra el fichero completo

    public void mostrarFichero(String ruta) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
            CampamentoImpl p = (CampamentoImpl) ois.readObject();

            while(p != null) {
                System.out.println(p.toString());
                p = (CampamentoImpl) ois.readObject();
            }
            ois.close();
        }
        catch(EOFException err) {
            System.out.println();
        }
        catch (IOException err) {
            err.printStackTrace();
        }
        catch (ClassNotFoundException err) {
            err.printStackTrace();
        }
    }
    */

    /*
    * Lee y valida una calificacion.
    * Salida: char opcion.
    * Postcondiciones: asociado al nombre devuelve un caracter. 'O', 'N', 'G' o 'D'.
    * Cabecera: public char LeerValidarCalificacion()
    * */
    public char LeerValidarCalificacion(){
        Scanner teclado = new Scanner(System.in);
        char calificacion;

        do{
            System.out.println("Escribe la calificacion. 'D', 'N', 'G' o 'D'.");
            calificacion = Character.toUpperCase(teclado.next().charAt(0));
        }while(calificacion != 'O' && calificacion != 'N' &&
                calificacion != 'G' && calificacion != 'D');

        return calificacion;
    }

    /*
     * Lee una pais.
     * Salida: String pais.
     * Postcondiciones: asociado al nombre devuelve un String que es el nombre del pais.
     * Cabecera: public String LeerPais()
     * */
    public String LeerPais(){
        Scanner teclado = new Scanner(System.in);
        String pais;

        System.out.println("Dime el pais");
        pais = teclado.nextLine();

        return pais;
    }
}
