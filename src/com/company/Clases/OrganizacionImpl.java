package com.company.Clases;

import com.company.Excepciones.ExcepcionesOrganizaciones;
import com.company.Interfaces.Organizacion;

/*
* Propiedades basicas:
*   - String pais, consultable y modificable.
*   - String nombre, consultable y modificable.
*   - Int totalInternos, consultable y modificable.
*   - Int numeroVoluntarios, consultable y modificable
* Propiedades derivadas: nada.
* Metodos añadidos:
*   - equals
*   - compareTo
*   - toString
*   - hashCode
*   - clone
* Propiedades compartidas: nada.
* Restricciones:
*   - totalInternos no puede ser negativo.
*   - numeroVoluntarios no puede ser negativo
*
* Getter/Setter
* String getPais()
* void setPais(String pais)
*
* String getNombre()
* void setNombre(String nombre)
*
* int getTotalInternos()
* void setTotalInternos(int internos)
*
* int getNumeroVoluntarios()
* void setNumeroVoluntarios(int voluntarios)
* */
public class OrganizacionImpl implements Organizacion, Cloneable, Comparable<OrganizacionImpl> {
    private String pais;
    private String nombre;
    private int totalInternos;
    private int numeroVoluntarios;

    //Constructor por defecto
    public OrganizacionImpl(){
        pais = new String();
        nombre = new String();
        totalInternos = 0;
        numeroVoluntarios = 0;
    }

    //Constructor con parametros
    public OrganizacionImpl(String pais, String nombre, int totalInternos, int numeroVoluntarios){
        this.pais = pais;
        this.nombre = nombre;
        this.totalInternos = totalInternos;
        this.numeroVoluntarios = numeroVoluntarios;
    }

    //Constructor de copia
    public OrganizacionImpl(OrganizacionImpl org){
        this.pais = org.getPais();
        this.nombre = org.getNombre();
        this.totalInternos = org.getTotalInternos();
        this.numeroVoluntarios = org.getNumeroVoluntarios();
    }

    //getter y setter
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getTotalInternos(){
        return totalInternos;
    }
    public void setTotalInternos(int internos){
        this.totalInternos = internos;
    }

    public int getNumeroVoluntarios(){
        return numeroVoluntarios;
    }
    public void setNumeroVoluntarios(int voluntarios){
        this.numeroVoluntarios= voluntarios;
    }

    //Metodos añadidos
    @Override
    public int hashCode() {
        return nombre.hashCode() *numeroVoluntarios;
    }

    /*
     * 2 objetos OrganizacionImpl son iguales si coinciden pais y nombre.
     * */
    @Override
    public boolean equals(Object obj) {
        boolean ret = false;
        if(this == obj)
            ret = true;
        else if(obj != null && obj instanceof OrganizacionImpl){
            OrganizacionImpl otro = (OrganizacionImpl)obj;
            if(this.getPais().equals(otro.getPais())
                && this.getNombre().equals(otro.getNombre())){
                ret = true;
            }
        }
        return ret;
    }

    @Override
    public OrganizacionImpl clone(){
        OrganizacionImpl copia = null;
        try{
            copia = (OrganizacionImpl) super.clone();
        }catch(CloneNotSupportedException error){
            System.out.println("Error en la copia");
        }
        return copia;
    }

    @Override
    public String toString() {
        return getPais() + "," + getNombre() + "," + getTotalInternos() + "," + getNumeroVoluntarios();
    }

    /*Criterio de comparacion:
     * Devuelve 0 si el pais y el nombre son iguales
     * Devuelve 1 si los nombres son iguales.
     * Devuelve -1 si ni el nombre ni el pais son iguales
     * */
    public int compareTo(OrganizacionImpl otro){
        int ret = -1;

        if(this.getPais().equals(otro.getPais()) && this.getNombre().equals(otro.getNombre())){
            ret = 0;
        }else if(this.getPais().compareTo(otro.getPais()) > 0 || (this.getPais().compareTo(otro.getPais()) == 0 && this.getNombre().compareTo(otro.getNombre()) > 0 )){
            ret = 1;
        }
        return ret;
    }
}
