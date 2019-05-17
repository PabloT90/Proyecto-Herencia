package com.company.Tests;

import com.company.Clases.OrganizacionImpl;

public class TestOrganizacion {
    public static void main(String[] args){
        //Constructor por defecto
        OrganizacionImpl org1 = new OrganizacionImpl();
        System.out.println("Por defecto: "+org1.toString());

        //Constructor con parametros
        OrganizacionImpl org2 = new OrganizacionImpl("Angola","Tartulia", 1, 1);
        System.out.println("Con parametros: "+org2.toString());

        //Construtor de copia
        OrganizacionImpl org3 = new OrganizacionImpl(org2);
        System.out.println("De copia: "+org3.toString());

        //Gets y sets

        org1.setPais("Pensilvania");
        //org1.setPais("Espana");
        System.out.println("Pais: "+org1.getPais());

        org1.setNombre("Nombre1");
        //org1.setNombre("Nombre2");
        System.out.println("Nombre: "+org1.getNombre());

        org1.setNombre("Rafae");
        System.out.println("Nombre: "+org1.getNombre());

        org1.setNumeroVoluntarios(11);
        org1.setNumeroVoluntarios(-11);
        System.out.println("Numero voluntarios: "+org1.getNumeroVoluntarios());

        org1.setTotalInternos(11);
        //org1.setTotalInternos(-12);
        System.out.println("Total internos: "+org1.getTotalInternos());


        //hashCode
        System.out.println("hashCode: "+ org1.hashCode());

        //equals
        System.out.println("Equals org1 con el 2: "+org1.equals(org2));
        System.out.println("Equals org2 con el 3: "+org1.equals(org3));

        //CompareTo
        System.out.println("compareTo jugador 1 con el 2: "+org1.compareTo(org2));
        System.out.println("compareTo jugador 1 con el 3: "+org1.compareTo(org3));

        //Clone
        System.out.println("Prueba clone: ");
        System.out.println("org1.toString() --> "+org1.toString());
        System.out.println("org3.toString() --> "+org3.toString());

        System.out.println("org3 = org1.clone() --> Realizamos la clonacion");
        org3 = org1.clone();
        System.out.println("org1.equals(org3) --> "+org1.equals(org3));

        //totring
        System.out.println("org.toString(): "+ org1.toString());
    }
}
