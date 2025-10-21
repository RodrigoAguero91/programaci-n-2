
package javaapplication27.TrabajoPractico6.Ejercicio3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */


import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private final String id;
    private final String nombre;
    private final String especialidad;
    private final List<Curso> cursos; 

    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("    (No dicta cursos actualmente.)");
            return;
        }
        for (Curso c : cursos) {
            System.out.printf("    - [%s] %s\n", c.getCodigo(), c.getNombre());
        }
    }

    
    public void mostrarInfo() {
        System.out.printf("PROFESOR: %s | ID: %s | Especialidad: %s | Cursos asignados: %d\n",
                nombre, id, especialidad, cursos.size());
    }
}
