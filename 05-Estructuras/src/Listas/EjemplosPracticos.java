package Listas;
import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private double calificacion;

    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return nombre + " with grade: " + calificacion;
    }
}

public class EjemplosPracticos {
    public static void main(String[] args) {
        // Crear una lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Alice", 88));
        estudiantes.add(new Estudiante("Bob", 92));
        estudiantes.add(new Estudiante("Charlie", 77));
        estudiantes.add(new Estudiante("Diana", 85));

        // Calcular la calificación promedio
        double sumaCalificaciones = 0;
        Estudiante mejorEstudiante = null;

        for (Estudiante estudiante : estudiantes) {
            sumaCalificaciones += estudiante.getCalificacion();
            if (mejorEstudiante == null || estudiante.getCalificacion() > mejorEstudiante.getCalificacion()) {
                mejorEstudiante = estudiante;
            }
        }

        double promedioCalificaciones = sumaCalificaciones / estudiantes.size();

        // Imprimir la calificación promedio y el estudiante con la calificación más alta
        System.out.println("Average grade: " + promedioCalificaciones);
        if (mejorEstudiante != null) {
            System.out.println("Top student: " + mejorEstudiante);
        }
    }
}