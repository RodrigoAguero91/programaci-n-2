package javaapplication27;

public class tp3Ejercicio4 {

    public static void main(String[] args) {

        
        var gallina1 = new Gallina(1, 1);
        var gallina2 = new Gallina(2, 2);

        System.out.println("--- Estado inicial de las gallinas ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        
        System.out.println("\n--- Simulando el paso del tiempo y acciones ---");
        
        
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();

        
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();

        
        System.out.println("\n--- Estado final de las gallinas ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}

class Gallina {

   
    private final int idGallina;
    private int edad;
    private int huevosPuestos;

    
    public Gallina(int idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0; 
    }

    
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina #" + this.idGallina + " ha puesto un huevo. Total de huevos: " + this.huevosPuestos);
    }

    
    public void envejecer() {
        this.edad++;
        System.out.println("La gallina #" + this.idGallina + " ha envejecido. Nueva edad: " + this.edad + " años.");
    }

    
    public void mostrarEstado() {
        System.out.println("Gallina ID: " + this.idGallina);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Huevos Puestos: " + this.huevosPuestos);
        System.out.println("--------------------");
    }
}