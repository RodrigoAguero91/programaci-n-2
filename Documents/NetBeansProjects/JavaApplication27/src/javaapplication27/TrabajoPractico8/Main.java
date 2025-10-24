package javaapplication27.TrabajoPractico8;


import javaapplication27.TrabajoPractico8.Interfaces.Cliente;
import java.util.Scanner;
import javaapplication27.TrabajoPractico8.Excepciones.EdadInvalidaException;
import javaapplication27.TrabajoPractico8.Excepciones.EjerciciosExcepciones;
import javaapplication27.TrabajoPractico8.Excepciones.ValidadorEdad;
import javaapplication27.TrabajoPractico8.Interfaces.PayPal;
import javaapplication27.TrabajoPractico8.Interfaces.Pedido;
import javaapplication27.TrabajoPractico8.Interfaces.Producto;
import javaapplication27.TrabajoPractico8.Interfaces.TarjetaCredito;

public class Main {
    public static void main(String[] args) {
        
        // --- INICIO DE MODIFICACIÓN NECESARIA ---
        // DEBE REEMPLAZAR LA RUTA DE EJEMPLO POR SU RUTA ABSOLUTA REAL.
        // SUGERENCIA: USE BARRA DIAGONAL (/) PARA EVITAR PROBLEMAS DE ESCAPE.
        String RUTA_ARCHIVO_PRUEBA; 
        // --- FIN DE MODIFICACIÓN NECESARIA ---
        RUTA_ARCHIVO_PRUEBA = "C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\JavaApplication27\\src\\javaapplication27\\TrabajoPractico8\\test.txt";
        
        try (
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("--- PARTE 1: INTERFACES EN E-COMMERCE ---");
            
            Producto p1 = new Producto("Laptop", 1200.00);
            Producto p2 = new Producto("Mouse", 25.00);
            Pedido pedido = new Pedido();
            pedido.agregarProducto(p1);
            pedido.agregarProducto(p2);
            
            double totalSinDescuento = pedido.calcularTotal();
            System.out.println("Total del pedido (Pagable): $" + totalSinDescuento);
            
            TarjetaCredito tc = new TarjetaCredito();
            PayPal pp = new PayPal();
            double totalConDescuento = tc.aplicarDescuento(totalSinDescuento);
            System.out.println("Total con Descuento (Tarjeta): $" + totalConDescuento);
            tc.procesarPago(totalConDescuento);
            pp.procesarPago(totalSinDescuento);
            System.out.println("----------------------------------------");
            
            Cliente cliente = new Cliente("Juan Perez");
            pedido.actualizarEstado("ENVIADO", cliente);
            System.out.println("\n--- PARTE 2: EJERCICIOS SOBRE EXCEPCIONES ---");
            
            System.out.println("\nEjercicio 1: División Segura (Pruebe con 10 / 0)");
            EjerciciosExcepciones.divisionSegura(scanner);
            
            System.out.println("\nEjercicio 2: Conversión de Cadena (Pruebe con 'hola123')");
            EjerciciosExcepciones.convertirCadena(scanner);
            
            System.out.println("\nEjercicio 3: Lectura de Archivo (Ruta debe ser válida)");
            
            // Se usa la ruta absoluta
            EjerciciosExcepciones.lecturaArchivo(RUTA_ARCHIVO_PRUEBA);
            
            System.out.println("\nEjercicio 4: Excepción Personalizada");
            try {
                ValidadorEdad.validar(30);
                ValidadorEdad.validar(150);
            } catch (EdadInvalidaException e) {
                System.err.println("¡Excepción capturada en Main! " + e.getMessage());
            }
            
            System.out.println("\nEjercicio 5: Uso de Try-with-resources");
            // Se usa la ruta absoluta
            EjerciciosExcepciones.leerConTryWithResources(RUTA_ARCHIVO_PRUEBA);
            System.out.println("--- PRUEBAS COMPLETAS ---");
            }
    }
    
}
            

