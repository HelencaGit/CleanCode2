
package es.ed.model;

/**
 *
 * @author Helen
 */
public class Autobus extends Vehiculo{
    private int capacidadPasajeros;
    private int antiguedad;
    private Ruedas ruedas;

    public Autobus() {
    }

    public Autobus(String marca, String paisFabricacion, int antiguedad, int capacidadPasajeros, String combustible, String color) {
        super(marca, paisFabricacion, combustible, color);
        this.antiguedad = antiguedad;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Ruedas getRuedas() {
        return ruedas;
    }

    public void setRuedas(Ruedas ruedas) {
        this.ruedas = ruedas;
    }
    
      /* En comprobarSiEsNuevo usamos una uncheked exception, que generalmente son las que 
    heredan de las excepciones en tiempo de ejecución (RuntimeException)*/
    public static void comprobarSiEsNuevo(int[] antiguedadAutobuses) {
        for (int antiguedad:antiguedadAutobuses) {
            String mensaje = "Es antiguo";
            if (antiguedad < 0) {
                throw new IllegalArgumentException("La antiguedad del vehículo no puede ser negativa");
            } else if (antiguedad<5) {
                mensaje = "Es nuevo";
            }
            System.out.println(mensaje);
        }
    }
    
    /* En este método podemos ver como si la antigüedad es negativa, devolvemos 
    un valor lógico, en lugar de null, así evitamos posibles NullPointerException
    si intentasemos usar la antigüedad en float sin haber comprobado todo*/
    public static float devolverAntiguedadEnFloat(int antiguedad) {
        float antiguedadFloat = 0.0f;
        if (antiguedad>0) {
            antiguedadFloat = antiguedad;
        }
        return antiguedadFloat;
    }

}
