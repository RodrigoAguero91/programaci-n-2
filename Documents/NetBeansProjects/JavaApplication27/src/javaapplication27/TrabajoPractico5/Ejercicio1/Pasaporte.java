
package javaapplication27.TrabajoPractico5.Ejercicio1;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

public class Pasaporte {
    private final String numero;
    private final String fechaEmision;
    private final Foto foto; 
    private final Titular titular; 
    private final String nombre;
    private final String apellido;
    private final String fechaNacimiento;
    private final String numeroPasaporte;

    public Pasaporte(String nombre, String apellido, String fechaNacimiento, String numeroPasaporte, Foto foto, Titular titular, java.lang.String fechaEmision) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.numeroPasaporte = numeroPasaporte;
    this.foto = foto;
    this.titular = titular;
    titular.setPasaporte(this); 
        this.numero = null;
        this.fechaEmision = fechaEmision;
}

    String getNumeroPasaporte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   
}

