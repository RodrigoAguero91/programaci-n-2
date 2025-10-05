package javaapplication27;


public class tp3Ejercicio1 {

    public static void main(String[] args) {
        
       
        var estudiante = new Estudiante("Rodrigo", "Aguero", "Programación Orientada a Objetos", 8.5);

        
        estudiante.mostrarInfo();

        
        estudiante.subirCalificacion(1.0);
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
}