
package javaapplication27;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class tp2Ejercicio13 {
        
    public static void imprimirPrecios(double[] precios, int indice) {
        
        if (indice >= precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);

        imprimirPrecios(precios, indice + 1);
    }

    public static void main(String[] args) {
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        
        
        imprimirPrecios(precios, 0);

        
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");

        imprimirPrecios(precios, 0);
    }
}
