
package es.ed.model;

/**
 *
 * @author Helen
 */
public class Tren extends Vehiculo{
    private int vagones;

    public Tren() {
    }

    public Tren(String marca, String paisFabricacion, int vagones, String combustible, String color) {
        super(marca, paisFabricacion,combustible, color);
        this.vagones = vagones;
    }

    public int getVagones() {
        return vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }
    
    
}
