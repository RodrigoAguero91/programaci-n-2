
package javaapplication27.TrabajoPractico8.Interfaces;


public class Producto implements Pagable {
    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularTotal() {
        return this.precio;
    }
    
    
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}