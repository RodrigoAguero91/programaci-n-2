
package javaapplication27.TrabajoPractico8.Interfaces;


public class PayPal implements Pago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("  -> Pagando con PayPal. Monto: " + monto);
        return true;
    }
}