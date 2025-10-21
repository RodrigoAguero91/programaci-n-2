
package javaapplication27.TrabajoPractico6.Ejercicio1;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */


import java.util.ArrayList;
import java.util.List;

public class Inventario {
    
    private final List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    
    public void agregarProducto(Producto p) {
        if (buscarProductoPorId(p.getId()) == null) {
            productos.add(p);
            System.out.println("✅ Producto agregado: " + p.getNombre());
        } else {
            System.out.println("❌ Error: Producto con ID " + p.getId() + " ya existe.");
        }
    }

    
    public void listarProductos() {
        System.out.println("\n--- LISTADO COMPLETO DE PRODUCTOS ---");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("🗑️ Producto eliminado: " + p.getNombre());
            return true;
        }
        System.out.println("❌ Error al eliminar: Producto con ID " + id + " no encontrado.");
        return false;
    }

    
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("📈 Stock actualizado para " + p.getNombre() + ". Nuevo stock: " + nuevaCantidad);
            return true;
        }
        System.out.println("❌ Error al actualizar stock: Producto con ID " + id + " no encontrado.");
        return false;
    }

    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- PRODUCTOS FILTRADOS por " + categoria.name() + " ---");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en la categoría " + categoria.name());
        }
    }

    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.printf("\n--- PRODUCTOS FILTRADOS entre $%.2f y $%.2f ---\n", min, max);
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
    }

    
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.printf("• %s: %s\n", cat.name(), cat.getDescripcion());
        }
    }
}
