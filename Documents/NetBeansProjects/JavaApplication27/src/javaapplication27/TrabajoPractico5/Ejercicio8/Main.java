
package javaapplication27.TrabajoPractico5.Ejercicio8;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Julián Vega", "julian@mail.com");
        Documento doc = new Documento("Contrato", "Contenido del contrato...", "abc123", "2025-08-01", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario de la firma: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash de firma: " + doc.getFirma().getCodigoHash());

    }
}