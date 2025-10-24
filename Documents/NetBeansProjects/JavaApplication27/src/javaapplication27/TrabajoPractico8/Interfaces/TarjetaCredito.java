
package javaapplication27.TrabajoPractico8.Interfaces;


public class TarjetaCredito implements PagoConDescuento {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("  -> Pagando con Tarjeta de Crédito. Monto: " + monto);
        return true;
    }

    @Override
    public double aplicarDescuento(double monto) {
        
        return monto * 0.90;
    }
}


