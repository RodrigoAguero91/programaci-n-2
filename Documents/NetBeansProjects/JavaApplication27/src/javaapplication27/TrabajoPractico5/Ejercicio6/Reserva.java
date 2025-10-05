
package javaapplication27.TrabajoPractico5.Ejercicio6;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
import java.time.LocalDateTime;

public class Reserva {
    private final LocalDateTime fechaHora;
    private final Cliente cliente; 
    private final Mesa mesa;       

    public Reserva(LocalDateTime fechaHora, Cliente cliente, Mesa mesa) {
        this.fechaHora = fechaHora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    Object getCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getMesa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getFechaHora() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

