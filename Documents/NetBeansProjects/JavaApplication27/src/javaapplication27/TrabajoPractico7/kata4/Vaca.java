
package javaapplication27.TrabajoPractico7.kata4;

public class Vaca extends Animal {
    
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuuuu.");
    }
    
    @Override
    public String describirAnimal() {
        return getNombre() + " (Vaca)";
    }
}