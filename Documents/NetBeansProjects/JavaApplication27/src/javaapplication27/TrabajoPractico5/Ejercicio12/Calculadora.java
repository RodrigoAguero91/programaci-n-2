
package javaapplication27.TrabajoPractico5.Ejercicio12;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Calculadora {

    public void calcular(Impuesto impuesto) {
        System.out.println("Cálculo de impuesto de: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto: $" + impuesto.getMonto());
    }

}
