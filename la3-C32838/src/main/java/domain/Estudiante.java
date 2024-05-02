package domain;

import java.util.ArrayList;
import java.util.List;

final class Estudiante extends Persona {
    private String fechaNacimiento;
    private boolean activo;

    public Estudiante(String nombre, String identificacion, String fechaNacimiento, boolean activo) {
        super(nombre, identificacion);
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
    }

    // Método equals redefinido en la subclase Estudiante
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Estudiante)) {
            return false;
        }
        Estudiante estudiante = (Estudiante) obj;
        return fechaNacimiento.equals(estudiante.fechaNacimiento) && activo == estudiante.activo;
    }
}
