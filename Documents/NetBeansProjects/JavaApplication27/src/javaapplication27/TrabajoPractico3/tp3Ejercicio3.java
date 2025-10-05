package javaapplication27;

public class tp3Ejercicio3 {

    public static void main(String[] args) {

        
        var miLibro = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954);

        
        System.out.println("--- Información inicial del libro ---");
        System.out.println("Título: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Año de Publicación: " + miLibro.getAñoPublicacion());

        
        System.out.println("\n--- Intentando modificar el año ---");
        miLibro.setAñoPublicacion(2030);

       
        System.out.println("\n--- Intentando modificar el año a un valor válido ---");
        miLibro.setAñoPublicacion(1965);

        
        System.out.println("\n--- Información final del libro ---");
        System.out.println("Título: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Año de Publicación: " + miLibro.getAñoPublicacion());
    }
}

class Libro {
    
    private final String titulo;
    private final String autor;
    private int añoPublicacion;

    
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    
    public void setAñoPublicacion(int año) {
        
        if (año > 0 && año <= 2025) { 
            this.añoPublicacion = año;
            System.out.println("¡Año de publicación actualizado a " + año + "!");
        } else {
            System.out.println("Error: El año de publicación " + año + " no es válido. No se realizó el cambio.");
        }
    }
}