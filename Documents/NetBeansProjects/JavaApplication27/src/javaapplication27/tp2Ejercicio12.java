
package javaapplication27;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class tp2Ejercicio12 {
        public static void main(String[] args) {

        
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");

        
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");

        
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
