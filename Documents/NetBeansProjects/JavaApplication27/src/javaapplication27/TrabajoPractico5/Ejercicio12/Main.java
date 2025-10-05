
package javaapplication27.TrabajoPractico5.Ejercicio12;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Julián Castro", "20-12345678-9");
        Impuesto impuesto = new Impuesto(3500.75, contribuyente);
        Calculadora calculadora = new Calculadora();

        calculadora.calcular(impuesto);
    }
}
