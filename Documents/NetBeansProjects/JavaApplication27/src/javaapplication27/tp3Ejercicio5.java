package javaapplication27;

public class tp3Ejercicio5 {

    public static void main(String[] args) {

        
        var miNave = new NaveEspacial("Falcon 9", 50);

        System.out.println("--- Estado inicial de la nave ---");
        miNave.mostrarEstado();

       
        System.out.println("\n--- Intentando avanzar 60 km sin recargar ---");
        miNave.avanzar(60);

        
        System.out.println("\n--- Recargando combustible ---");
       
        miNave.recargarCombustible(30);

        
        System.out.println("\n--- Intentando recargar más allá del límite ---");
        miNave.recargarCombustible(100);

       
        System.out.println("\n--- Intentando avanzar 60 km con suficiente combustible ---");
        miNave.avanzar(60);

        
        System.out.println("\n--- Estado final de la nave ---");
        miNave.mostrarEstado();
    }
}

class NaveEspacial {

    
    private final String nombre;
    private double combustible;
    private final double CAPACIDAD_MAXIMA = 100.0; 
    
    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        
        if (combustibleInicial > CAPACIDAD_MAXIMA) {
            this.combustible = CAPACIDAD_MAXIMA;
            System.out.println("El combustible inicial excede el límite. Se ajustó a " + CAPACIDAD_MAXIMA);
        } else {
            this.combustible = combustibleInicial;
        }
    }
    
    
    public void despegar() {
        if (combustible >= 10) { // Se asume que despegar requiere 10 unidades
            combustible -= 10;
            System.out.println("¡La nave " + nombre + " ha despegado! Combustible restante: " + combustible);
        } else {
            System.out.println("Fallo al despegar. Combustible insuficiente.");
        }
    }

    
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia / 10; 
        if (this.combustible >= combustibleNecesario) {
            this.combustible -= combustibleNecesario;
            System.out.println("La nave " + this.nombre + " ha avanzado " + distancia + " km.");
            System.out.println("Combustible restante: " + this.combustible);
        } else {
            System.out.println("¡Alerta! No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (this.combustible + cantidad <= CAPACIDAD_MAXIMA) {
            this.combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades. Nuevo total: " + this.combustible);
        } else {
            System.out.println("Error: No se puede recargar. La cantidad excede el límite de " + CAPACIDAD_MAXIMA + ".");
        }
    }

    
    public void mostrarEstado() {
        System.out.println("Nave: " + this.nombre);
        System.out.println("Combustible: " + this.combustible + "/" + CAPACIDAD_MAXIMA);
    }
}