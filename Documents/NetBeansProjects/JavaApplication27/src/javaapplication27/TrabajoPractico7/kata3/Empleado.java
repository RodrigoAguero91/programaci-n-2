
package javaapplication27.TrabajoPractico7.kata3;


public abstract class Empleado {
    protected String nombre; 

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    
    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }
}
