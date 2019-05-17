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

import com.company.Excepciones.ExcepcionesCampamento;
import com.company.Excepciones.ExcepcionesOrganizaciones;


public class CampamentoImpl extends OrganizacionImpl {
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

    public void setCalificacion(char calificacion) throws ExcepcionesCampamento {
        if(calificacion == 'O' || calificacion == 'N' || calificacion == 'G' || calificacion == 'D') {
            this.calificacion = calificacion;
        }
        else {
            throw new ExcepcionesCampamento("La calificacion debe ser O,N,G o D");
        }

    }

    //Guerra
    public char getGuerra() {
        return guerra;
    }

    public void setGuerra(char guerra) throws ExcepcionesCampamento{
        if(guerra == 's' || guerra == 'n') {
            this.guerra = guerra;
        }
        else {
            throw new ExcepcionesCampamento("La guera es si o no (s/n)");
        }

    }

    @Override
    //No es la misma cabecera
    public void setTotalInternos(int totalInternos) throws ExcepcionesCampamento {
        if(totalInternos >= 20 && totalInternos <= 50) {
            try {
                super.setTotalInternos(totalInternos);
            } catch (ExcepcionesOrganizaciones excepcionesOrganizaciones) {
                excepcionesOrganizaciones.printStackTrace();
            }
        }
        else {
            throw new ExcepcionesCampamento("El total de internos tiene que ser de 20 a 50");
        }
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + ", " + calificacion + ", " + guerra + ", " + totalInternos;
     }
}
