
package javaapplication27.TrabajoPractico5.Ejercicio9;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("María Torres", "OSDE");
        Profesional profesional = new Profesional("Dr. Ricardo Gómez", "Cardiología");
        CitaMedica cita = new CitaMedica(LocalDateTime.of(2025, 10, 15, 9, 0), paciente, profesional);

        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
        System.out.println("Especialidad: " + cita.getProfesional().getEspecialidad());
        System.out.println("Fecha y hora: " + cita.getFechaHora());
    }
}

