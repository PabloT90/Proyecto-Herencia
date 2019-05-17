package com.company.Clases;
import java.io.*;
public class Gestora {

    /*
    Interfaz
    Nombre: CalcularInternosTotales
    Comentario: Este subprograma calcula los internos totales de un pais
    Cabecera: public int calcularInternosTotales(String ruta, String pais)
    Precondiciones: El fichero (ruta) debe estar creado
    Entrada: - String ruta //Es la ruta donde se encuentra el fichero
             - String pais //Es el pais en el que queremos buscar
    Salida: - int total //El total de internos del pais en cuestion
    E/S: No hay
    Postcondiciones: Asociado al nombre. Es el total de internos del pais que se ha introducido por parametros
    */

    public int calcularInternosTotales(String ruta, String pais) {
        int total = 0;
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(ruta));

            CampamentoImpl p = (CampamentoImpl) ois.readObject();

            while(p != null) {
                if(p.getPais().equals(pais)) {
                    total += p.getTotalInternos();
                }

                p = (CampamentoImpl) ois.readObject();

            }
        }

        catch(EOFException err) {
            System.out.println("");
        }

        catch (FileNotFoundException err) {
            err.printStackTrace();
        }
        catch (IOException err) {
            err.printStackTrace();
        }
        catch (ClassNotFoundException err) {
            err.printStackTrace();
        }
        finally {
            try {
                if(ois != null) {
                    ois.close();
                }
            }
            catch(IOException err) {
                err.printStackTrace();
            }
        }
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
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(ruta));

            CampamentoImpl p = (CampamentoImpl) ois.readObject();

            while(p != null) {
                if(p.getGuerra() == 'n') {
                    total += p.getNumeroVoluntarios();
                }

                p = (CampamentoImpl) ois.readObject();

            }
        }

        catch(EOFException err) {
            System.out.println("");
        }

        catch (FileNotFoundException err) {
            err.printStackTrace();
        }
        catch (IOException err) {
            err.printStackTrace();
        }
        catch (ClassNotFoundException err) {
            err.printStackTrace();
        }
        finally {
            try {
                if(ois != null) {
                    ois.close();
                }
            }
            catch(IOException err) {
                err.printStackTrace();
            }
        }
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
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(ruta));

            CampamentoImpl p = (CampamentoImpl) ois.readObject();

            while(p != null) {
                if(p.getGuerra() == 's') {
                    total += p.getNumeroVoluntarios();
                }

                p = (CampamentoImpl) ois.readObject();

            }
        }

        catch(EOFException err) {
            System.out.println("");
        }

        catch (FileNotFoundException err) {
            err.printStackTrace();
        }
        catch (IOException err) {
            err.printStackTrace();
        }
        catch (ClassNotFoundException err) {
            err.printStackTrace();
        }
        finally {
            try {
                if(ois != null) {
                    ois.close();
                }
            }
            catch(IOException err) {
                err.printStackTrace();
            }
        }
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

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(ruta));

            CampamentoImpl p = (CampamentoImpl) ois.readObject();

            while(p != null) {
                if(p.getPais().equals(pais)) {
                    paisEncontrado = true;
                }

                p = (CampamentoImpl) ois.readObject();

            }
        }

        catch(EOFException err) {
            System.out.println("");
        }

        catch (FileNotFoundException err) {
            err.printStackTrace();
        }
        catch (IOException err) {
            err.printStackTrace();
        }
        catch (ClassNotFoundException err) {
            err.printStackTrace();
        }
        finally {
            try {
                if(ois != null) {
                    ois.close();
                }
            }
            catch(IOException err) {
                err.printStackTrace();
            }
        }

        return paisEncontrado;
    }
}
