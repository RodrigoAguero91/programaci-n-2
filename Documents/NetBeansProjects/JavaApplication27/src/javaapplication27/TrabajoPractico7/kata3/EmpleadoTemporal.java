
package javaapplication27.TrabajoPractico7.kata3;


public class EmpleadoTemporal extends Empleado {
    private static final double SUELDO_POR_HORA = 500.0;
    private final int horasTrabajadas;

    public EmpleadoTemporal(String nombre) {
        super(nombre);
        
        this.horasTrabajadas = 160; 
    }

    
    @Override
    public double calcularSueldo() {
        return SUELDO_POR_HORA * horasTrabajadas;
    }
}