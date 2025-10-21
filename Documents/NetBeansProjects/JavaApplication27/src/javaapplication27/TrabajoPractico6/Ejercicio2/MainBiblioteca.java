
package javaapplication27.TrabajoPractico6.Ejercicio2;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */


public class MainBiblioteca {
    public static void main(String[] args) {
        
        Biblioteca central = new Biblioteca("Biblioteca Central UTN");
        System.out.println("✅ Biblioteca '" + central.nombre + "' creada.");

       
        Autor a1 = new Autor("AUT001", "Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("AUT002", "Jane Austen", "Británica");
        Autor a3 = new Autor("AUT003", "Jorge Luis Borges", "Argentino");
        System.out.println("✅ 3 Autores creados.");

       
        System.out.println("\n--- 3. AGREGANDO LIBROS ---");
        central.agregarLibro("978-6073177894", "Cien años de soledad", 1967, a1);
        central.agregarLibro("978-0141439518", "Orgullo y Prejuicio", 1813, a2);
        central.agregarLibro("978-8420455808", "Ficciones", 1944, a3);
        central.agregarLibro("978-8437604947", "El amor en los tiempos del cólera", 1985, a1);
        central.agregarLibro("978-8491054350", "Persuasión", 1818, a2);

        
        central.listarLibros();

        
        System.out.println("\n--- 5. BUSCANDO LIBRO POR ISBN ---");
        String isbnBuscado = "978-8420455808";
        Libro libroEncontrado = central.buscarLibroPorIsbn(isbnBuscado);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado con ISBN: " + isbnBuscado);
        }

        
        central.filtrarLibrosPorAnio(1813);
        
        
        System.out.println("\n--- 7. ELIMINANDO LIBRO Y LISTANDO RESTANTES ---");
        central.eliminarLibro("978-8437604947");
        central.listarLibros();

        
        System.out.println("\n--- 8. CANTIDAD TOTAL DE LIBROS ---");
        System.out.println("Total de libros en stock: " + central.obtenerCantidadLibros());
        
        
        central.mostrarAutoresDisponibles();
    }
}