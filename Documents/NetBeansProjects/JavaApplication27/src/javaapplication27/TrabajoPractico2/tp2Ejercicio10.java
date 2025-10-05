
package javaapplication27.TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class tp2Ejercicio10 {
        
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el stock actual del producto:");
        int stockActual = scanner.nextInt();

        System.out.println("Ingrese la cantidad vendida:");
        int cantidadVendida = scanner.nextInt();

        System.out.println("Ingrese la cantidad recibida:");
        int cantidadRecibida = scanner.nextInt();

        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);

    }
}
