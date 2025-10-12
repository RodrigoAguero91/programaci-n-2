
package javaapplication27.TrabajoPractico5.Ejercicio10;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Main {

    public static void main(String[] args) {
        Titular titular = new Titular("Federico Díaz", "33445566");
        ClaveSeguridad cs = new ClaveSeguridad("seg123", "2025-08-01");
        CuentaBancaria cuenta = new CuentaBancaria("2220001133445566", 150000.0, "seg123", "2025-08-01");
        titular.setCuenta(cuenta);
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());

    }
}
