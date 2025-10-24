package javaapplication27.TrabajoPractico8.Excepciones;

import java.io.*;
import java.util.Scanner;

public class EjerciciosExcepciones {
    
    // 1. División segura (ArithmeticException)
    public static void divisionSegura(Scanner sc) {
        try {
            System.out.print("Ingrese numerador: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese divisor: ");
            int num2 = sc.nextInt();
            
            sc.nextLine(); // Consumir el salto de línea pendiente
            
            int resultado = num1 / num2; 
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.err.println("Error 1: No se puede dividir por cero. " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Error 1: Por favor, ingrese solo números enteros.");
            sc.nextLine(); // Consumir la entrada inválida
        }
    }
    
    // 2. Conversión de cadena a número (NumberFormatException)
    public static void convertirCadena(Scanner sc) {
        System.out.print("Ingrese un texto para convertir a int: ");
        String texto = sc.nextLine();
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido con éxito: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Error 2: El texto ingresado no es un número entero válido.");
        }
    }
    
    
    // 3. Lectura de archivo (FileNotFoundException)
    public static void lecturaArchivo(String ruta) {
        try {
            File archivo = new File(ruta);
            // Usar try-with-resources con Scanner para cierre automático
            try (Scanner lector = new Scanner(archivo)) { 
                System.out.println("Contenido del archivo (Eje 3):");
                while (lector.hasNextLine()) {
                    System.out.println(lector.nextLine());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error 3: Archivo no encontrado en la ruta: " + ruta);
        }
    }
    
    
    // 5. Uso de try-with-resources (IOException)
    public static void leerConTryWithResources(String ruta) {
        // ERROR CORREGIDO: Se eliminó un 'new' repetido.
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            System.out.println("Contenido (Try-with-resources Eje 5):");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) { 
            System.err.println("Error 5: Fallo de I/O o Archivo no encontrado. " + e.getMessage());
        }
    }
}