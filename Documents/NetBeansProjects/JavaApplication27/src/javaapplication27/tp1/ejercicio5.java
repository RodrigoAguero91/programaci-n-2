package javaapplication27;

import java.util.Scanner;


public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,suma,resta,multi,div;
        
        
        System.out.print("Ingrese el primer numero= ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo numero= ");
        num2 = input.nextInt();
       
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        div = num1 % num2;
        
        System.out.println("La suma  es " + suma);
        System.out.println("Tu resta es " + resta);
        System.out.println("Tu multiplicacion es " + multi);
        System.out.println("Tu division es " + div);
    }

}