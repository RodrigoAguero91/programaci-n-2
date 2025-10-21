
package javaapplication27.TrabajoPractico6.Ejercicio3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    final String nombre;
    private final List<Profesor> profesores;
    private final List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    
    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) == null) profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) == null) cursos.add(c);
    }

    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("❌ Curso con código " + codigoCurso + " no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println("❌ Profesor con ID " + idProfesor + " no encontrado.");
            return;
        }

        
        curso.setProfesor(profesor);
        System.out.printf("✅ Asignación realizada: %s a %s\n", profesor.getNombre(), curso.getNombre());
    }

    
    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            
            if (curso.getProfesor() != null) {
                
                curso.setProfesor(null); 
            }
            cursos.remove(curso);
            System.out.println("🗑️ Curso eliminado y desvinculado: " + curso.getNombre());
            return true;
        }
        System.out.println("❌ Curso no encontrado para eliminar: " + codigo);
        return false;
    }

    
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            
            List<Curso> cursosDictados = new ArrayList<>(profesor.getCursos());
            
            for (Curso c : cursosDictados) {
                
                c.setProfesor(null); 
            }
            
            profesores.remove(profesor);
            System.out.println("🗑️ Profesor eliminado y cursos desvinculados: " + profesor.getNombre());
            return true;
        }
        System.out.println("❌ Profesor no encontrado para eliminar: " + id);
        return false;
    }

    
    public void reporteCursosPorProfesor() {
        System.out.println("\n--- REPORTE: Cantidad de Cursos por Profesor ---");
        for (Profesor p : profesores) {
            System.out.printf("• %s (%s): %d cursos\n", p.getNombre(), p.getId(), p.getCursos().size());
        }
    }

    public void listarCursos() {
    System.out.println("\n--- CURSOS DE LA UNIVERSIDAD ---");
    
    
    if (cursos.isEmpty()) {
        System.out.println("No hay cursos registrados.");
        return;
    }
    cursos.forEach(Curso::mostrarInfo);
}

    public void listarProfesores() {
    System.out.println("\n--- PROFESORES DE LA UNIVERSIDAD ---");
    profesores.forEach(Profesor::mostrarInfo);
}
}
