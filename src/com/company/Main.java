package com.company;

/*
Nombre del programa: main
Analisis
 Entrada: - int opcion
          - int opcionVoluntario
          - Objeto Organizaciones
          - Objeto Campamento

 Salida: - Mensajes con el usuario
         - Listado con diferentes

 Requisitos: - opcion tiene que estar entre 0 y 5
             - opcionVoluntario tiene que estar entre 0 y 2

 PG Level 0
 Inicio
    Repetir
        mostrarMenuPrincipal*
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
        mostrarVoluntarios*
        leeryValidarOpcionVoluntario*
        Segun opcionVoluntario
            Caso 1
                VoluntariosNoEnGuerra
            Caso 2
                VoluntariosEnGuerra
        FinSegun
    Mientras opcion sea 0
 Fin
 */

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        int opcionVoluntario = 0;
        String rutaFichero;

        do {
            mostrarMenuPrincipal();
            leeryValidarOpcion();

            switch (opcion) {
                case 1:
                    System.out.println("CalcularInternosTotales");
                    break;

                case 2:
                    System.out.println("VoluntariosEnGuerra");
                    do {
                        mostrarMenuVoluntarios();
                        leeryValidarOpcionVoluntario();

                        switch (opcionVoluntario) {
                            case 1:
                                System.out.println("VoluntariosNoEnGuerra");
                                break;

                            case 2:
                                System.out.println("VoluntariosEnGuerra");
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
