
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class tp2Ejercicio5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPares = 0;
        int numero;

        System.out.println("Este programa suma solo los números pares.");
        System.out.println("Ingrese un número (0 para terminar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break; 
            }

            if (numero % 2 == 0) {
                sumaPares += numero; 
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
     
    }
}
