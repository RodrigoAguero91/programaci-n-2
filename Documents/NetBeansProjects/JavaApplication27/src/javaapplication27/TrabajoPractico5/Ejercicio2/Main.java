
package javaapplication27.TrabajoPractico5.Ejercicio2;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Li-Ion", 4000);
        Usuario usuario = new Usuario("Ana Gómez", "98765432");
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", bateria, usuario);

        System.out.println("Celular de: " + usuario.getNombre());
    }
}

