package com.company.Clases;
import java.io.*;

public class resguardos {

    /*
    Interfaz
    Nombre: CalcularInternosTotales
    Comentario: Este subprograma calcula los internos totales de un pais
    Cabecera: public int calcularInternosTotales(String ruta, String pais)
    Precondiciones: - El fichero (ruta) debe estar creado
                    - El pais debe existir en el fichero
    Entrada: - String ruta //Es la ruta donde se encuentra el fichero
             - String pais //Es el pais en el que queremos buscar
    Salida: - int total //El total de internos del pais en cuestion
    E/S: No hay
    Postcondiciones: Asociado al nombre. Es el total de internos del pais que se ha introducido por parametros
    */
    public int calcularInternosTotales(String ruta, String pais) {
        int total = 0;
        System.out.println("En resguardo");
        return total;
    }

    /*
    Interfaz
    Nombre: VoluntariosNoEnGuerra
    Comentario: Muestra un listado con los voluntarios que no estan en guerra
    Cabecera: public int voluntariosNoEnGuerra(String ruta)
    Precondiciones: El fichero (ruta) debe estar creado
    Entrada: - String ruta //Es la ruta donde se encuentra el fichero
    Salida: - int total //El total de voluntarios que no estan en guerra
    E/S: No hay
    Postcondiciones: Asociado al nombre. El total de voluntarios que no estan en guerra
    */
    public int voluntariosNoEnGuerra(String ruta) {
        int total = 0;
        System.out.println("En resguardo");
        return total;
    }

    /*
    Interfaz
    Nombre: VoluntariosEnGuerra
    Comentario: Muestra un listado con los voluntarios que estan en guerra
    Cabecera: public int voluntariosEnGuerra(String ruta)
    Precondiciones: El fichero (ruta) debe estar creado
    Entrada: - String ruta //Es la ruta donde se encuentra el fichero
    Salida: - int total //El total de voluntarios que estan en guerra
    E/S: No hay
    Postcondiciones: Asociado al nombre. El total de voluntarios que estan en guerra
    */
    public int voluntariosEnGuerra(String ruta) {
        int total = 0;
        System.out.println("En resguardo");
        return total;
    }

    /*
    Interfaz
    Nombre: PaisesCorrectos
    Comentario: En este subrograma se mostrara verdadero si el pais esta en el fichero y false sino
    Cabecera: public boolean paisesCorrectos(String ruta)
    Precondiciones: El fichero (ruta) debe estar creado
    Entrada: - String ruta //Es la ruta donde se encuentra el fichero
    Salida: - boolean paisEncontrado //True si el pais es encontrado y false si no lo esta
    E/S: No hay
    Postcondiciones: Asociado al nombre. Si el pais es encontrado devolvera true y si no es encontrado sera false
    */
    public boolean paisesCorrectos(String ruta, String pais) {
        boolean paisEncontrado = false;
        System.out.println("En resguardo");
        return paisEncontrado;
    }

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
        System.out.println("En resguardo");
    }

    /*
     * Muestra los campos en guerra y los paises al que pertenecen.
     * Entrada:
     *   - String ruta.
     * Precondiciones: el fichero debe estar creado. Es decir, que es en la ruta especificada exista.
     * Postcondiciones: nada, solo muestra en pantalla.
     * Cabecera: public void camposEnGuerra(String ruta)
     * */
    public void camposEnGuerra(String ruta){
        System.out.println("En resguardo");
    }

    /*
     * Calcula el numero de voluntarios de un pais.
     * Entrada:
     *   - String ruta.
     *   - String pais
     * Salida:
     *   -numVoluntarios int
     * Precondiciones: el fichero debe estar creado. Es decir, que es en la ruta especificada exista.
     * Postcondiciones: asociado al nombre devuelve el numero de voluntarios que hay en un pais.
     * Cabecera: public int totalVoluntarios(String ruta, String pais)
     * */
    public int totalVoluntarios(String ruta, String pais){
        int numVoluntarios = 0;
        System.out.println("En resguardo");
        return numVoluntarios;
    }
}
