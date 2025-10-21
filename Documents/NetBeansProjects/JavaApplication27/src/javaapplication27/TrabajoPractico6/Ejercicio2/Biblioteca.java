
package javaapplication27.TrabajoPractico6.Ejercicio2;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nombre;
    private final  List<Libro> libros; 

    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        
        if (buscarLibroPorIsbn(isbn) == null) {
            Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
            libros.add(nuevoLibro);
            System.out.println("✅ Libro agregado: " + titulo);
        } else {
            System.out.println("❌ Error: Ya existe un libro con ISBN " + isbn);
        }
    }

    
    public void listarLibros() {
        System.out.println("\n--- LISTADO DE LIBROS EN LA BIBLIOTECA: " + nombre + " ---");
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("----------------------------------------");
        }
    }

    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    
    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("🗑️ Libro eliminado: " + libroAEliminar.getTitulo());
            return true;
        }
        System.out.println("❌ Error: Libro con ISBN " + isbn + " no encontrado para eliminar.");
        return false;
    }

    
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n--- LIBROS PUBLICADOS EN EL AÑO " + anio + " ---");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en " + anio);
        }
    }
    
    
    public void mostrarAutoresDisponibles() {
        System.out.println("\n--- AUTORES DE LOS LIBROS EN LA BIBLIOTECA ---");
        
        List<String> nombresAutoresUnicos = new ArrayList<>();
        
        for (Libro libro : libros) {
            String nombreAutor = libro.getAutor().getNombre();
            
            if (!nombresAutoresUnicos.contains(nombreAutor)) {
                nombresAutoresUnicos.add(nombreAutor);
            }
        }
        
        if (nombresAutoresUnicos.isEmpty()) {
            System.out.println("No hay autores disponibles.");
            return;
        }
        
        for (String nombre : nombresAutoresUnicos) {
            System.out.println("• " + nombre);
        }
    }
}