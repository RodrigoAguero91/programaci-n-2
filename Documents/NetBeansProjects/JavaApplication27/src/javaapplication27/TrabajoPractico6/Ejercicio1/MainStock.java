
package javaapplication27.TrabajoPractico6.Ejercicio1;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

public class MainStock {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

       
        System.out.println("--- 1. AGREGANDO PRODUCTOS ---");
        inventario.agregarProducto(new Producto("A101", "Manzanas x Kg", 500.00, 150, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("E205", "Smartphone X", 250000.00, 30, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("R310", "Remera Algodón", 1500.00, 200, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("H402", "Juego Sábanas", 4500.00, 50, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("E206", "Auriculares BT", 2500.00, 120, CategoriaProducto.ELECTRONICA)); 
        inventario.agregarProducto(new Producto("A102", "Leche UAT", 800.00, 300, CategoriaProducto.ALIMENTOS));

        
        inventario.listarProductos();

        
        System.out.println("\n--- 3. BUSCAR PRODUCTO E205 ---");
        Producto buscado = inventario.buscarProductoPorId("E205");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        
        inventario.filtrarPorCategoria(CategoriaProducto.ROPA);

        
        System.out.println("\n--- 6. ACTUALIZAR STOCK ---");
        inventario.actualizarStock("A101", 10);
        inventario.buscarProductoPorId("A101").mostrarInfo();

        
        System.out.println("\n--- 5. ELIMINAR PRODUCTO ---");
        inventario.eliminarProducto("H402");
        inventario.listarProductos();

       
        System.out.println("\n--- 7. TOTAL DE STOCK ---");
        System.out.println("Stock total en inventario: " + inventario.obtenerTotalStock());

        
        System.out.println("\n--- 8. PRODUCTO CON MAYOR STOCK ---");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) {
            mayor.mostrarInfo();
        }


        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);

        
        inventario.mostrarCategoriasDisponibles();
    }
}
