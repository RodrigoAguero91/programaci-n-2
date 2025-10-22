package javaapplication27.TrabajoPractico7.kata2;

import java.util.ArrayList; 
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\n--- Tarea 2: Figuras y Polimorfismo ---");
        
        
        List<Figura> figuras = new ArrayList<>(); 
        
        figuras.add(new Circulo(3.5));       
        figuras.add(new Rectangulo(5.0, 8.0)); 

        
        for (Figura f : figuras) {
            
            System.out.println("La figura " + f.getNombre() + 
                               " tiene un área de: " + f.calcularArea());
        }
    }
}