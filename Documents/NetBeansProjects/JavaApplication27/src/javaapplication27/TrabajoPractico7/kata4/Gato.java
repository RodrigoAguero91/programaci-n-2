
package javaapplication27.TrabajoPractico7.kata4;


public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau.");
    }
    
    @Override
    public String describirAnimal() {
        return getNombre() + " (Gato)";
    }
}