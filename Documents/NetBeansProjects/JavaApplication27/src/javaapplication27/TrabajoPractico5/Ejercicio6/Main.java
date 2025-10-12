
package javaapplication27.TrabajoPractico5.Ejercicio6;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro Albornoz", "11332211");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-09-10", "21:00", mesa);
        reserva.setCliente(cliente);
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());

    }

}
