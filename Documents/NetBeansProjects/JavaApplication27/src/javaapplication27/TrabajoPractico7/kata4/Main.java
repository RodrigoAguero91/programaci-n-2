
package javaapplication27.TrabajoPractico7.kata4;

import java.util.ArrayList; 
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\n--- Tarea 4: Animales y Polimorfismo ---");
        
        List<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Lassie"));
        animales.add(new Gato("Silvestre"));
        animales.add(new Vaca("Margarita"));
        
        for (Animal a : animales) {
          
            System.out.print(a.describirAnimal() + " dice: ");
            a.hacerSonido(); 
        } 
    }
}