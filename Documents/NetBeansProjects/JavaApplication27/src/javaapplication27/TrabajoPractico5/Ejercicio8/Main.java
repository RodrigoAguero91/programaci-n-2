
package javaapplication27.TrabajoPractico5.Ejercicio8;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Laura Benítez", "laura.benitez@email.com");
        FirmaDigital firma = new FirmaDigital("ABC123XYZ", LocalDate.of(2025, 10, 5), usuario);
        Documento documento = new Documento("Contrato de alquiler", "Contenido legal del contrato...", firma);

        System.out.println("Documento: " + documento.getTitulo());
        System.out.println("Firmado por: " + documento.getFirma().getUsuario().getNombre());
        System.out.println("Fecha de firma: " + documento.getFirma().getFecha());
    }
}
