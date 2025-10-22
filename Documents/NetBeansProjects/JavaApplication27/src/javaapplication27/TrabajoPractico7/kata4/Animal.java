
package javaapplication27.TrabajoPractico7.kata4;

public class Animal {
    private final String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido raro.");
    }
    
    public String describirAnimal() {
        return nombre + " (Animal)";
    }
    
    public String getNombre() {
        return nombre;
    }
}