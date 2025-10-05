
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class tp2Ejercicio1 {
        public static void main(String[] args) {
            
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Por favor, ingrese un año:");
                int anio = scanner.nextInt();
                
                boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
                
                if (esBisiesto) {
                    System.out.println(anio + " es un año bisiesto.");
                } else {
                    System.out.println(anio + " no es un año bisiesto.");
                }   }
    }
}
