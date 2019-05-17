package com.company.Tests;

import com.company.Clases.CampamentoImpl;
import com.company.Clases.OrganizacionImpl;

public class TestCampamento {
    public static void main(String[] args) {
        CampamentoImpl c1 = new CampamentoImpl("Angola","Tartulia", 1, 1,'O','N');
        CampamentoImpl c2 = new CampamentoImpl("Angola","Tartulia", 1, 1,'D','S');

        //Calificacion
        System.out.println(c1.getCalificacion());
        c1.setCalificacion('G');
        System.out.println(c1.getCalificacion());

        //Guerra
        System.out.println(c2.getGuerra());
        c2.setGuerra('N');
        System.out.println(c2.getGuerra());

        //toString
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
