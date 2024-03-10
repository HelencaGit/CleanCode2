
package es.ed.model;

/**
 *
 * @author Helen
 */
public class Vehiculo {
    private String empresa;
    private String paisFabricacion;
    private String combustible;
    private String color;

    public Vehiculo(){
    }
    
    public Vehiculo(String empresa, String paisFabricacion, String combustible, String color) {
        this.empresa = empresa;
        this.paisFabricacion = paisFabricacion;
        this.combustible = combustible;
        this.color = color;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPaisFabricacion() {
        return paisFabricacion;
    }

    public void setPaisFabricacion(String paisFabricacion) {
        this.paisFabricacion = paisFabricacion;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public static String concatenar2ColoresVehiculo(String color1, String color2) {
        String fraseAntes = anadirFraseAntes();
        return fraseAntes+color1+" y "+color2;
    }
    
    private static String anadirFraseAntes() {
        return "Estos son los colores del vehiculo ";
    }
    
}
