
package javaapplication27.TrabajoPractico7.kata4;

public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre); 
    }

    
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau! ¡Guau!");
    }
    
    @Override
    public String describirAnimal() {
        return getNombre() + " (Perro)";
    }
}