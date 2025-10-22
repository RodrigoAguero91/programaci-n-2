
package javaapplication27.TrabajoPractico7.kata3;


import java.util.ArrayList; 
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\n--- Tarea 3: Empleados y Polimorfismo ---");
        
        
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new EmpleadoPlanta("Juan Pérez"));
        listaEmpleados.add(new EmpleadoTemporal("Ana Gómez"));
        listaEmpleados.add(new EmpleadoPlanta("Carlos Ruiz"));

        for (Empleado e : listaEmpleados) {
            
            
            double sueldo = e.calcularSueldo();
            
            System.out.println("\nEmpleado: " + e.getNombre());
            System.out.println("  - Sueldo: $" + sueldo);

            
            if (e instanceof EmpleadoPlanta) {
                System.out.println("  - Tipo: Empleado de Planta (Sueldo Fijo).");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("  - Tipo: Empleado Temporal (Pago por Horas).");
            }
        }
    }
}