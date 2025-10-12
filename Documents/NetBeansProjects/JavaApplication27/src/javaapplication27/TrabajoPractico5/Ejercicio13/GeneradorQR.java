
package javaapplication27.TrabajoPractico5.Ejercicio13;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado para: " + qr.getUsuario().getNombre() + " - Valor: " + qr.getValor());
    }

}