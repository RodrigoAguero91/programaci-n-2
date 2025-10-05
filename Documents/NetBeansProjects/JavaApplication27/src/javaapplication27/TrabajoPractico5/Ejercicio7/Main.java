
package javaapplication27.TrabajoPractico5.Ejercicio7;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Diesel", "MTR123456");
        Conductor conductor = new Conductor("Carlos Méndez", "LIC987654");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Hilux", motor, conductor);

        System.out.println("Conductor: " + conductor.getNombre());
        System.out.println("Vehículo: " + conductor.getVehiculo().getModelo());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
    }
}
