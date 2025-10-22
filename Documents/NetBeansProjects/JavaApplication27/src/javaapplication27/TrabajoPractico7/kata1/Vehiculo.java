
package javaapplication27.TrabajoPractico7.kata1;


public class Vehiculo {
    private final String marca;
    private final String modelo;

    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    
    public void mostrarInfo() {
        System.out.println("Vehículo Base: " + marca + " " + modelo);
    }
}