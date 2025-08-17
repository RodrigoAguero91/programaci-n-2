
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class tp2Ejercicio9 {
        
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("Zona de envío no válida. Se asumirá costo de envío Nacional.");
            costoPorKg = 5.0; // Valor por defecto
        }

        return peso * costoPorKg;
    }

    
    public static double calcularTotalCompra(double precioProducto, double peso, String zona) {
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precioProducto = scanner.nextDouble();

        System.out.println("Ingrese el peso del paquete en kg:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la zona de envío (Nacional/Internacional):");
        String zona = scanner.next();

        
        double totalAPagar = calcularTotalCompra(precioProducto, peso, zona);

        System.out.println("El total a pagar es: " + totalAPagar);
        
        
    }
}
