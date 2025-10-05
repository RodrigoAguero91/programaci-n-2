
package javaapplication27.TrabajoPractico5.Ejercicio4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class TarjetaDeCredito {
    private final String numero;
    private final String fechaVencimiento;
    private final Cliente cliente; 
    private final Banco banco;     

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this); // Establece la relación bidireccional
    }

    
}

