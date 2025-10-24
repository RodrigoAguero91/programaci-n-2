
package javaapplication27.TrabajoPractico8.Interfaces;

import java.util.ArrayList;
import java.util.List;
import javaapplication27.TrabajoPractico5.Ejercicio4.Cliente;

public class Pedido implements Pagable {
    private final List<Producto> productos;
    private String estado;

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal(); 
        }
        return total;
    }
    
    public void actualizarEstado(String nuevoEstado, Notificable cliente) {
        this.estado = nuevoEstado;
        System.out.println("Pedido: Estado actualizado a " + nuevoEstado);
        // Notifica el cambio de estado al Cliente
        cliente.notificar("El estado de su pedido ha cambiado a: " + nuevoEstado);
    }

    public void actualizarEstado(String enviado, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}