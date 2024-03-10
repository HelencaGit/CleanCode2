package es.ed.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class AdministradorVehiculosTest {

    private List<Vehiculo> listaVehiculos;
    private Tren tren1;
    private Tren tren2;
    private Tren tren3;
    private Autobus autobus1;
    private Taxi taxi1;
    private Taxi taxi2;

    @BeforeAll
    public static void comenzarTests() {
        System.out.println("Comenzamos el test sobre la administración de vehículos");
        System.out.println("Vamos a tener 3 Trenes, 1 Autobus y 2 Taxis en una lista de Vehiculos");
    }

    @BeforeEach
    public void antesCada() {
        tren1 = new Tren("Talgo", "España", 23, "Electricidad","");
        tren2 = new Tren("AVE", "Alemania", 20, "Electricidad","");
        tren3 = new Tren("Avlo", "Francia", 15, "Electricidad","");
        autobus1 = new Autobus("Alsa", "España", 2, 60, "Diesel","");
        taxi1 = new Taxi("Toyota", "Japón","45323T",true,"Híbrido","");
        taxi2 = new Taxi("Dacia", "Francia","48473T",false,"Gasolina","");
        listaVehiculos = new ArrayList<>();
        listaVehiculos.add(tren1);
        listaVehiculos.add(tren2);
        listaVehiculos.add(tren3);
        listaVehiculos.add(autobus1);
        listaVehiculos.add(taxi1);
        listaVehiculos.add(taxi2);
        assertAll(
            () -> {assertNotNull(listaVehiculos);}, //Comprobamos que existan vehiculos en la lista
            () -> {assertEquals("España", listaVehiculos.get(3).getPaisFabricacion());}, //Comprobamos que el pais de fabricación para el autobus es España
            () -> {assertTrue(taxi1.isLicenciaVigor());} //Comprobamos que el taxi1 tiene la licencia en vigor
        );
    }

    @Test
    public void testAgregarColorAVehiculoNoNulo() {
        String colorCompuesto = Vehiculo.concatenar2ColoresVehiculo("Azul", "Verde");
        assertNotNull(colorCompuesto,"El color compuesto es nulo");
    }

    @Test
    public void testBorrarVehiculoLista() {
        System.out.println("********************************");
        System.out.println("Lista antes de eliminar el Dacia");
        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo vehiculo = listaVehiculos.get(i);
            System.out.println(vehiculo.getEmpresa());
        }
        
        listaVehiculos.removeLast();
        assertFalse(listaVehiculos.getLast().getEmpresa().equals("Dacia"));
        System.out.println("********************************");
        System.out.println("Lista después de eliminar el Dacia");
        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo vehiculo = listaVehiculos.get(i);
            System.out.println(vehiculo.getEmpresa());
        }
    }

    @AfterEach
    public void despuesCada() {
        System.out.println("Vaciamos la lista antes de cada test");
        listaVehiculos.removeAll(listaVehiculos);
    }

    @AfterAll
    public static void terminarTests() {
        System.out.println("Hemos terminado nuestras pruebas correctamente!!!");
    }
}
