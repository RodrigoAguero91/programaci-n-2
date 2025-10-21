
package javaapplication27.TrabajoPractico6.Ejercicio2;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */


public class Autor {
    private final String id;
    private final String nombre;
    private final String nacionalidad;

    
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void mostrarInfo() {
        System.out.printf("   [Autor] ID: %s | Nombre: %s | Nacionalidad: %s\n",
                id, nombre, nacionalidad);
    }
}