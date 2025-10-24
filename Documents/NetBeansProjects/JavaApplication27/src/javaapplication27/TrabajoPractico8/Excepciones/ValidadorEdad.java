
package javaapplication27.TrabajoPractico8.Excepciones;


public class ValidadorEdad {
    
    public static void validar(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            
            throw new EdadInvalidaException("La edad debe ser un valor entre 0 y 120.");
        }
        System.out.println("Edad validada correctamente: " + edad);
    }
}
