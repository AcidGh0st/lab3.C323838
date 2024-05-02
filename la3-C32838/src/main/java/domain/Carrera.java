package domain;

import java.util.ArrayList;
import java.util.List;

class Carrera {
    private String identificacion;
    private String nombre;
    private List<Curso> cursos;

    public Carrera(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    // Método para agregar un curso a la carrera
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }
}
