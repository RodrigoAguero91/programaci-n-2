
package javaapplication27.TrabajoPractico5.Ejercicio5;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Main {

    public static void main(String[] args) {
        Propietario propietario = new Propietario("Luis Ramírez", "22334455");
        Computadora pc = new Computadora("HP", "SN123456", "ASUS TUF", "B450");
        propietario.setComputadora(pc);

        System.out.println("Propietario: " + pc.getPropietario().getNombre());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());

    }

}

