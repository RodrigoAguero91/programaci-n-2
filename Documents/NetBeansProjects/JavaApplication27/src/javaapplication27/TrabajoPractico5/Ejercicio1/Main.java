package javaapplication27.TrabajoPractico5.Ejercicio1;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("foto.jpg", "JPG");
        Titular titular = new Titular("Juan Pérez", "12345678");
        Pasaporte pasaporte = new Pasaporte("Juan", "Pérez", "1990-01-01", "A123456", foto, titular, null);

        System.out.println("Titular del pasaporte: " + titular.getNombre());
        System.out.println("Número de pasaporte: " + titular.getPasaporte().getNumeroPasaporte());
    }
}
