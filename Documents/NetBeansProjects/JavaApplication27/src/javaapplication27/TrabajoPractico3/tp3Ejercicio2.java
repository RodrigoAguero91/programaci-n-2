package javaapplication27;


public class tp3Ejercicio2 {

    public static void main(String[] args) {

        
        var miMascota = new Mascota("Max", "Perro", 3);

        
        miMascota.mostrarInfo();
        miMascota.cumplirAnios();
        miMascota.mostrarInfo();
    }
}


class Mascota {

    
    String nombre;
    String especie;
    int edad;

    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

   
    public void mostrarInfo() {
        System.out.println("--- Información de la Mascota ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad + " años");
    }

    
    public void cumplirAnios() {
        this.edad++;
        System.out.println("¡Feliz cumpleaños, " + this.nombre + "! Ahora tiene " + this.edad + " años.");
    }
}