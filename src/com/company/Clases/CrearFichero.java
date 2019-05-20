package com.company.Clases;

public class CrearFichero {
    public static void main(String[] args){
        String ruta = "Prueba2.dat";
        FuncionesFicheros ff = new FuncionesFicheros();
        CampamentoImpl c1 = new CampamentoImpl("Espanistan", "Yokse", 25, 7, 'O', 'N');
        CampamentoImpl c2 = new CampamentoImpl("PobreYeray", "Yokse", 35, 1, 'O', 'S');
        CampamentoImpl c3 = new CampamentoImpl("PobreRafa", "Yokse", 50, 1, 'G', 'N');
        CampamentoImpl c4 = new CampamentoImpl("PobrePablo", "Yokse", 27, 1, 'D', 'S');
        CampamentoImpl c5 = new CampamentoImpl("AsunApruebanos", "pordiosyaeh", 20, 0, 'O', 'S');
        CampamentoImpl c6 = new CampamentoImpl("PorTutatis", "conflow", 31, 1, 'N', 'N');

        //Creamos el fichero binario en caso de no exisitir.
        ff.crearFicheroBinario("Prueba2.dat");

        //Insertar algunos valores
        ff.insertarCampamento(c1, ruta);
        ff.insertarCampamento(c2, ruta);
        ff.insertarCampamento(c3, ruta);
        ff.insertarCampamento(c4, ruta);
        ff.insertarCampamento(c5, ruta);
        ff.insertarCampamento(c6, ruta);

        //OrdenarPorPaisyNombre
        ff.ordenarPorPaisYNombre("Prueba2.dat");
    }
}
