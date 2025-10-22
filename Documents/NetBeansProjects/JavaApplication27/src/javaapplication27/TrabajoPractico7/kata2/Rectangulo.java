
package javaapplication27.TrabajoPractico7.kata2;


public class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo"); 
        this.altura = altura;
        this.base = 0;
    }

    
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

