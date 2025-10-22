
package javaapplication27.TrabajoPractico7.kata1;



public class Auto extends Vehiculo {
    private final int cantidadPuertas;

    
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas;
    }

    
    @Override
    public void mostrarInfo() {
        System.out.println("--- Información del Auto ---");
        
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Puertas: " + cantidadPuertas);
        System.out.println("----------------------------");

        
    }
}


    
 
