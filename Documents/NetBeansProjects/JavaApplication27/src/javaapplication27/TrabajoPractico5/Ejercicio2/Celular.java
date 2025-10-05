
package javaapplication27.TrabajoPractico5.Ejercicio2;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

public class Celular {
    private final String imei;
    private final String marca;
    private final String modelo;
    private final Bateria bateria; 
    private final Usuario usuario; 

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this); 
    }

    
}
