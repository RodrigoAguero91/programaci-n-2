
package javaapplication27.TrabajoPractico5.Ejercicio5;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Main {
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("ASUS ROG", "Z790");
        Propietario propietario = new Propietario("Martín López", "12345678");
        Computadora compu = new Computadora("Dell", "SN123456", placa, propietario);

        System.out.println("Propietario: " + propietario.getNombre());
        System.out.println("Marca de computadora: " + propietario.getComputadora().getMarca());
        System.out.println("Placa madre: " + compu.getPlacaMadre().getModelo());
    }
}

