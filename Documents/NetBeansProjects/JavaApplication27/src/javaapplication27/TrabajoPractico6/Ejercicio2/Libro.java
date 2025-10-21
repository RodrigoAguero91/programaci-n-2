
package javaapplication27.TrabajoPractico6.Ejercicio2;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

public class Libro {
    private final String isbn;
    private final String titulo;
    private final int anioPublicacion;
    private final Autor autor; 
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    
    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public Autor getAutor() {
        return autor;
    }

    
    public void mostrarInfo() {
        System.out.printf("  Título: %s | ISBN: %s | Año: %d\n",
                titulo, isbn, anioPublicacion);
        
        autor.mostrarInfo();
    }

  
public String getTitulo() {
    return titulo; 
}

    
}
