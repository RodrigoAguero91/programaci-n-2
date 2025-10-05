
package javaapplication27.TrabajoPractico5.Ejercicio8;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
import java.time.LocalDate;

public class FirmaDigital {
    private final String codigoHash;
    private final LocalDate fecha;
    private final Usuario usuario; 

    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    
}
