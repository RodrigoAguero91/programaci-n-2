
package javaapplication27.TrabajoPractico7.kata3;


public class EmpleadoPlanta extends Empleado {
    private static final double SUELDO_FIJO = 50000.0; 

    public EmpleadoPlanta(String nombre) {
        super(nombre); 
    }

    
    @Override
    public double calcularSueldo() {
        return SUELDO_FIJO; 
    }
}