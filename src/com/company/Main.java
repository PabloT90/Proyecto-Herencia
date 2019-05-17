package com.company;
import java.util.*;
/*
Nombre del programa: main
Analisis
 Entrada: - int opcion
          - int opcionVoluntario

 Salida: - Mensajes con el usuario
         - Listado con diferentes opciones

 Requisitos: - opcion tiene que estar entre 0 y 5
             - opcionVoluntario tiene que estar entre 0 y 2

 PG Level 0
 Inicio
    Repetir
       MostrarMenuPrincipal*
        leeryValidarOpcion*
        Segun opcion
            Caso 1
                CalcularInternosTotales
            Caso 2
                VoluntariosEnGuerra
            Caso 3
                ListarCalificacion
            Caso 4
                CamposEnGuerraPorPaises
            Caso 5
                TotalVoluntarios
        FinSegun
    Mientras opcion sea 0
 Fin

 Modulo VoluntariosEnGuerra
 Inicio
     Repetir
       MostrarSubMenu*
        leeryValidarOpcionSubMenu*
        Segun opcionVoluntario
            Caso 1
                VoluntariosNoEnGuerra
            Caso 2
                VoluntariosEnGuerra
        FinSegun
    Mientras opcion sea 0
 Fin
 */

import com.company.Clases.Gestora;
import com.company.Clases.Utilidades;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        int opcionVoluntario = 0;
        String pais;
        String rutaFichero = "";
        boolean paisEncontrado;
        Scanner teclado = new Scanner(System.in);
        Gestora gestora = new Gestora();
        Utilidades util = new Utilidades();

        do {
            util.MostrarMenuPrincipal();
            opcion = util.leeryValidarOpcion();

            switch (opcion) {
                case 1:
                    //System.out.println("CalcularInternosTotales");
                    pais = util.LeerPais();
                    paisEncontrado = gestora.paisesCorrectos(rutaFichero, pais);
                    if(paisEncontrado) {
                        System.out.println(gestora.calcularInternosTotales(rutaFichero,pais));
                    }
                    else {
                        System.out.println("No hay ningun pais en el fichero");
                    }
                    break;

                case 2:
                    //System.out.println("VoluntariosEnGuerra");
                    do {
                        util.MostrarSubMenu();
                        opcionVoluntario = util.leeryValidarOpcionSubMenu();

                        switch (opcionVoluntario) {
                            case 1:
                                //System.out.println("VoluntariosNoEnGuerra");
                                System.out.println(gestora.voluntariosNoEnGuerra(rutaFichero));
                                break;

                            case 2:
                                //System.out.println("VoluntariosEnGuerra");
                                System.out.println(gestora.voluntariosEnGuerra(rutaFichero));
                                break;
                        }
                    }
                    while(opcionVoluntario != 0);
                    break;

                case 3:
                    System.out.println("ListarCalificacion");
                    break;

                case 4:
                    System.out.println("CamposEnGuerraPorPaises");
                    break;

                case 5:
                    System.out.println("TotalVoluntarios");
                    break;
            }
        }
        while(opcion != 0);
    }
}
