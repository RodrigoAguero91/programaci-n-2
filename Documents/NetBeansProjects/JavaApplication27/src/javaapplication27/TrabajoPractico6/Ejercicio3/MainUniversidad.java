
package javaapplication27.TrabajoPractico6.Ejercicio3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */


public class MainUniversidad {
    public static void main(String[] args) {
        Universidad utn = new Universidad("UTN - Programación a Distancia");
        System.out.println("✅ Universidad '" + utn.nombre + "' creada.");

        
        Profesor p1 = new Profesor("P001", "Dr. Alan Turing", "Algoritmos y Estructuras");
        Profesor p2 = new Profesor("P002", "Dra. Grace Hopper", "Bases de Datos");
        Profesor p3 = new Profesor("P003", "Ing. Hedy Lamarr", "Redes y Seguridad");

        Curso c1 = new Curso("AEL101", "Programación II");
        Curso c2 = new Curso("AEL202", "Estructuras de Datos");
        Curso c3 = new Curso("BDD301", "Diseño de Bases de Datos");
        Curso c4 = new Curso("RED401", "Ciberseguridad");
        Curso c5 = new Curso("AEL203", "POO Avanzada");
        Curso c6 = new Curso("RED402", "Telecomunicaciones"); 

        
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        utn.agregarCurso(c6);
        System.out.println("\n✅ Profesores y Cursos agregados a la Universidad.");

        
        System.out.println("\n--- 3. ASIGNACIONES INICIALES ---");
        utn.asignarProfesorACurso("AEL101", "P001"); 
        utn.asignarProfesorACurso("AEL202", "P001"); 
        utn.asignarProfesorACurso("AEL203", "P001"); 
        utn.asignarProfesorACurso("BDD301", "P002"); 
        utn.asignarProfesorACurso("RED401", "P003");
        utn.asignarProfesorACurso("RED402", "P003"); 

       
        utn.listarCursos();
        utn.listarProfesores();

        
        System.out.println("\n--- 4. VERIFICACIÓN DETALLADA (Lado Profesor P001) ---");
        Profesor pTuring = utn.buscarProfesorPorId("P001");
        if (pTuring != null) pTuring.listarCursos();

        
        System.out.println("\n--- 5. CAMBIO DE PROFESOR (AEL202: Turing -> Hopper) ---");
        utn.asignarProfesorACurso("AEL202", "P002"); // Asignar AEL202 a Hopper

        System.out.println("\n--- Verificación después del cambio ---");
        System.out.println("Estado de P001 (Turing):");
        pTuring.mostrarInfo();
        pTuring.listarCursos(); 
        
        System.out.println("\nEstado de P002 (Hopper):");
        Profesor pHopper = utn.buscarProfesorPorId("P002");
        if (pHopper != null) pHopper.mostrarInfo();
        if (pHopper != null) pHopper.listarCursos(); 

        
        System.out.println("\n--- 6. REMOVER CURSO (RED401) ---");
        utn.eliminarCurso("RED401"); 
        
        System.out.println("\nVerificación de P003 (Lamarr):");
        Profesor pLamarr = utn.buscarProfesorPorId("P003");
        if (pLamarr != null) pLamarr.mostrarInfo();
        if (pLamarr != null) pLamarr.listarCursos(); 

        
        System.out.println("\n--- 7. REMOVER PROFESOR (P003: Lamarr) ---");
        utn.eliminarProfesor("P003"); 

        System.out.println("\nVerificación de Cursos (RED402 debe estar 'Sin asignar'):");
        utn.listarCursos();

        
        utn.reporteCursosPorProfesor();
    }
}