package com.company.Clases;

public class CrearFichero {
    public static void main(String[] args){
        FuncionesFicheros ff = new FuncionesFicheros();
        CampamentoImpl c1 = new CampamentoImpl("Espanistan", "Yokse", 0, 7, 'O', 'N');
        CampamentoImpl c2 = new CampamentoImpl("PobreYeray", "Yokse", 0, 1, 'O', 'S');
        CampamentoImpl c3 = new CampamentoImpl("PobreRafa", "Yokse", 0, 1, 'G', 'N');
        CampamentoImpl c4 = new CampamentoImpl("PobrePablo", "Yokse", 0, 1, 'D', 'S');
        CampamentoImpl c5 = new CampamentoImpl("AsundejadeMandar", "pordiosyaeh", 3, 0, 'O', 'S');
        CampamentoImpl c6 = new CampamentoImpl("puyitapati", "conflow", 0, 1, 'N', 'N');

        //Creamos el fichero binario en caso de no exisitir.
        ff.crearFicheroBinario("Prueba2.dat");

        //Insertar algunos valores
        ff.insertarCampamento(c1);
        ff.insertarCampamento(c2);
        ff.insertarCampamento(c3);
        ff.insertarCampamento(c4);
        ff.insertarCampamento(c5);
        ff.insertarCampamento(c6);

        //OrdenarPorPaisyNombre
        ff.ordenarPorPaisYNombre("Prueba2.dat");
    }
}
