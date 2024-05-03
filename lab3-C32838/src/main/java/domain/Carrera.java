package domain;


import java.util.List;
import java.util.Objects;

class Carrera {
    private String identificacion;
    private String nombre;
    private List<Curso> cursos;

    public Carrera(String identificacion, String nombre, List<Curso> cursos) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.cursos = cursos;
    }

    // Método para agregar un curso a la lista de cursos de la carrera
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrera carrera = (Carrera) o;
        return Objects.equals(identificacion, carrera.identificacion) && Objects.equals(nombre, carrera.nombre) && Objects.equals(cursos, carrera.cursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacion, nombre, cursos);
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}


