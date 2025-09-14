
package tp3Ejercicio1;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class java {

}



public class tp3Ejercicio1 {

    public static void main(String[] args) {
        // 1. Instanciar a un estudiante
        Estudiante estudiante1 = new Estudiante("Rodrigo", "Aguero", "Programación Orientada a Objetos", 8.5);

        // 2. Mostrar su información inicial
        estudiante1.mostrarInfo();

        // 3. Aumentar la calificación
        estudiante1.subirCalificacion(1.0);

        // 4. Disminuir la calificación
        estudiante1.bajarCalificacion(0.5);
    }
}



class Estudiante {

   
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    
    public void mostrarInfo() {
        System.out.println("--- Información del Estudiante ---");
        System.out.println("Nombre: " + this.nombre + " " + this.apellido);
        System.out.println("Curso: " + this.curso);
        System.out.println("Calificación: " + this.calificacion);
    }

    
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("¡Calificación aumentada en " + puntos + " puntos! Nueva calificación: " + this.calificacion);
    }

    
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        System.out.println("¡Calificación disminuida en " + puntos + " puntos! Nueva calificación: " + this.calificacion);
    }
}