
package javaapplication27.TrabajoPractico5.Ejercicio6;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Sofía Ramírez", "1122334455");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva(LocalDateTime.of(2025, 10, 10, 20, 30), cliente, mesa);

        System.out.println("Reserva para: " + reserva.getCliente().getNombre());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());
        System.out.println("Fecha y hora: " + reserva.getFechaHora());
    }
}
