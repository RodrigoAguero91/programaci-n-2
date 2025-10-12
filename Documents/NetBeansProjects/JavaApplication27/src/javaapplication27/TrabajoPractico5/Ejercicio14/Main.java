
package javaapplication27.TrabajoPractico5.Ejercicio14;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Main {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Promo institucional", 3);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto); 

    }
}
