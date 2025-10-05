
package javaapplication27.TrabajoPractico5.Ejercicio13;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Valeria Soto", "valeria@email.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("VAL123QR", usuario);
    }
}
