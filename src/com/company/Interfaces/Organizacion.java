package com.company.Interfaces;

import com.company.Excepciones.ExcepcionesOrganizaciones;

/*
* Propiedades basicas:
*   - String pais, consultable y modificable.
*   - String nombre, consultable y modificable.
*   - Int totalInternos, consultable y modificable.
*   - Int numeroVoluntarios, consultable y modificable
* Propiedades derivadas: nada.
* Propiedades añadidas: nada.
* Propiedades compartidas: nada.
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
public interface Organizacion {
    public String getPais();
    public void setPais(String pais);

    public String getNombre();
    public void setNombre(String nombre);

    public int getTotalInternos();
    public void setTotalInternos(int internos) throws ExcepcionesOrganizaciones;

    public int getNumeroVoluntarios();
    public void setNumeroVoluntarios(int voluntarios) throws ExcepcionesOrganizaciones;
}
