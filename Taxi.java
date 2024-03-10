
package es.ed.model;

/**
 *
 * @author Helen
 */
public class Taxi extends Vehiculo{
    private String numLicencia;
    private boolean licenciaVigor;
    private Ruedas ruedas;

    public Taxi() {
    }
    
    public Taxi(String marca, String paisFabricacion, String numLicencia, boolean licenciaVigor, String combustible, String color) {
        super(marca, paisFabricacion, combustible, color);
        this.numLicencia = numLicencia;
        this.licenciaVigor = licenciaVigor;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public boolean isLicenciaVigor() {
        return licenciaVigor;
    }

    public void setLicenciaVigor(boolean licenciaVigor) {
        this.licenciaVigor = licenciaVigor;
    }

    public Ruedas getRuedas() {
        return ruedas;
    }

    public void setRuedas(Ruedas ruedas) {
        this.ruedas = ruedas;
    }

}
