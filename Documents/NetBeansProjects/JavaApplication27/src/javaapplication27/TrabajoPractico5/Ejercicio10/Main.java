
package javaapplication27.TrabajoPractico5.Ejercicio10;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("X1Y2Z3", LocalDate.of(2025, 10, 1));
        Titular titular = new Titular("Federico Ruiz", "11223344");
        CuentaBancaria cuenta = new CuentaBancaria("000123456789", 150000.50, clave, titular);

        System.out.println("Titular: " + titular.getNombre());
        System.out.println("CBU: " + titular.getCuenta().getCbu());
        System.out.println("Clave modificada el: " + cuenta.getClave().getUltimaModificacion());
    }
}
