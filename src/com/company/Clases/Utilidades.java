package com.company.Clases;

import java.util.Scanner;

public class Utilidades {

    /*
    * Muestra en pantalla las opciones del menu principal.
    * Postcondiciones: nada, solo muestra en pantalla.
    * Cabecera: public void MostrarMenuPrincipal()
    * */
    public void mostrarMenuPrincipal(){
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


}
