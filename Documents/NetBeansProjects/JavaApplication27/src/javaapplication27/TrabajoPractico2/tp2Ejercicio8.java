
package javaapplication27.TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class tp2Ejercicio8 {
        
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        
        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;
        
        
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio base del producto:");
        double precioBase = scanner.nextDouble();

        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):");
        double impuesto = scanner.nextDouble();

        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):");
        double descuento = scanner.nextDouble();

        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

       
    }
}
