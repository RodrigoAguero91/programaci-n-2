
package javaapplication27.TrabajoPractico5.Ejercicio14;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println(" para proyecto: " +
                "Render exportado en formato: " + render.getFormato() + render.getProyecto().getNombre());
    }
}
