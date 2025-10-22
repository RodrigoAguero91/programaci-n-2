
package javaapplication27.TrabajoPractico7.kata2;




public class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        super("Círculo"); 
        this.radio = radio;
    }

    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}


