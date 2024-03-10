package es.ed;

import es.ed.model.Autobus;
import es.ed.model.Ruedas;
import es.ed.model.Taxi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static final String PAIS = "Pais_";
    private static final String COMBUSTIBLE = "Combustible_";
    public static String rutaFichero = ""; 
    private static int antiguedad = 10; 
    public static void main(String[] args) {
        // Ejemplo de excepción no verificada (unchecked)
        int[] antiguedadAutobuses = {10, 5, 13};
        Autobus.comprobarSiEsNuevo(antiguedadAutobuses);
        
        rutaFichero = "/ruta/fichero.txt";
        try {
            // Intentamos abrir un archivo que no existe
            File archivo = new File(rutaFichero);
            FileInputStream stream = new FileInputStream(archivo);
            //Aquí leería el fichero si todo va bien
        } catch (FileNotFoundException fnfe) {
            // Capturamos la excepción y mostramos un mensaje
            System.out.println("El archivo no se encontró: " + fnfe.getMessage());
        } finally {
            // Dejamos la ruta a vacía, para que el programa quede consistente y a partir de ahora ya sabemos que no se puede leer
            rutaFichero = "";
        }
        if (!"".equals(rutaFichero)) {
            /* Como hemos dejado todo OK anteriormente, no tenemos el problema de que intente borrar un fichero que ya hemos comprobado
            que no existe*/
            File file = new File(rutaFichero);
            file.delete();
        }
        antiguedad = -1;
        float antiguedadFloat = Autobus.devolverAntiguedadEnFloat(antiguedad);
        System.out.println("antiguedadFloat: "+antiguedadFloat);
        
        //Con el código de abajo se ejemplifica la ley de Demeter
        Ruedas ruedas = new Ruedas();
        ruedas.setMaterialRuedas("Goma");
        ruedas.setNumRuedas(4);
        Taxi taxi = new Taxi("Renault", PAIS+"Francia", "73462B", true, COMBUSTIBLE+"Diesel", "Negro");
        taxi.setRuedas(ruedas);
        System.out.println("Voy a acceder al material de las ruedas del taxi, sin acceder directamente a ruedas");
        System.out.println(taxi.getRuedas().getMaterialRuedas());
        
        
    }
      
}