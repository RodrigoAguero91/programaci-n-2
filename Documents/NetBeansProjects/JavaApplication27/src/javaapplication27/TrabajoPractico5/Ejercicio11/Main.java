
package javaapplication27.TrabajoPractico5.Ejercicio11;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Main {

    public static void main(String[] args) {
        Artista artista = new Artista("Luis Fonsi", "Pop");
        Cancion cancion = new Cancion("Despacito", artista);
        Reproductor r = new Reproductor();
        r.reproducir(cancion); 

    }
}

