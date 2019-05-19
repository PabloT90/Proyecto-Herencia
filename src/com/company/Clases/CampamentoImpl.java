package com.company.Clases;


/*
Propiedades basicas
Calificacion
Tipo: char
Cons: Si
Mod: Si

Guerra
Tipo: char
Cons: Si
Mod: Si

totalInternos
Tipo: int
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
No hay

Get and Set
Calificacion
public char getCalificacion()
public void setCalificacion(char calificacion)

Guerra
public char getGuerra()
public void setGuerra(char guerra)

Requisitos:
- calificacion es: - O Optima
                   - N Normal
                   - G Grave
                   - D Desesperada
- guerra (s/n)
- totalInternos Entre 20 y 50

Metodos anhadidos
No hay

*/

import java.io.Serializable;

public class CampamentoImpl extends OrganizacionImpl implements Serializable {
    //Atributos
    private char calificacion;
    private char guerra;

    //Constructor
    public CampamentoImpl(String pais, String nombre, int totalInternos,int numeroVoluntarios, char calificacion, char guerra) {
        super(pais, nombre, totalInternos, numeroVoluntarios);
        this.calificacion = calificacion;
        this.guerra = guerra;

    }

    //Metodos
    //Calificacion
    public char getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(char calificacion) {
            this.calificacion = calificacion;
    }

    //Guerra
    public char getGuerra() {
        return guerra;
    }

    public void setGuerra(char guerra) {
            this.guerra = guerra;
    }


    //toString
    @Override
    public String toString() {
        return super.toString() + ", " + calificacion + ", " + guerra;
     }
}
