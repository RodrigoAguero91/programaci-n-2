
package javaapplication27.TrabajoPractico6.Ejercicio3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

public class Curso {
    private final String codigo;
    private final String nombre;
    private Profesor profesor; 

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; 
    }

    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    
    public void setProfesor(Profesor nuevoProfesor) {
        
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            
            this.profesor.getCursos().remove(this);
        }

        
        this.profesor = nuevoProfesor;

        
        if (nuevoProfesor != null) {
            
            if (!nuevoProfesor.getCursos().contains(this)) {
                nuevoProfesor.getCursos().add(this);
            }
        }
    }

    
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.printf("CURSO: [%s] %s | Profesor: %s\n",
                codigo, nombre, nombreProfesor);
    }
}
