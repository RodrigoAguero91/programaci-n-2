
package javaapplication27.TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class tp2Ejercicio4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precioOriginal = scanner.nextDouble();

        System.out.println("Ingrese la categoría del producto (A, B o C):");
        char categoria = scanner.next().toUpperCase().charAt(0);

        double descuento = 0.0;
        String porcentajeDescuento = "";

            switch (categoria) {
                case 'A' -> {
                    descuento = 0.10; 
                    porcentajeDescuento = "10%";
                }
                case 'B' -> {
                    descuento = 0.15; 
                    porcentajeDescuento = "15%";
                }
                case 'C' -> {
                    descuento = 0.20; 
                    porcentajeDescuento = "20%";
                }
                default -> {
                    System.out.println("Categoría no válida. No se aplicará descuento.");
                    porcentajeDescuento = "0%";
                }
            }

        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;

        System.out.println("\n--- Detalle del cálculo ---");
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Categoría seleccionada: " + categoria);
        System.out.println("Descuento aplicado: " + porcentajeDescuento);
        System.out.printf("Precio final: %.2f%n", precioFinal);
        
        
    }
}
