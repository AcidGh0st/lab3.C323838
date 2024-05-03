package domain;


import java.time.LocalDate;
import java.util.Objects;

final class Estudiante extends Persona {
    private LocalDate fechaNacimiento;
    private boolean activo;
    private String carnet;
    private ExamenAdmision examenAdmision;
    private Carrera carrera; // Atributo de tipo Carrera

    public Estudiante(String nombre, String apellidos, LocalDate fechaNacimiento, Carrera carrera, boolean activo, String carnet, ExamenAdmision examenAdmision) {
        super(nombre, apellidos);
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
        this.carnet = carnet;
        this.examenAdmision = examenAdmision;
        this.carrera = carrera;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Estudiante that = (Estudiante) o;
        return activo == that.activo && Objects.equals(fechaNacimiento, that.fechaNacimiento) && Objects.equals(carnet, that.carnet) && Objects.equals(examenAdmision, that.examenAdmision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaNacimiento, activo, carnet, examenAdmision);
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public ExamenAdmision getExamenAdmision() {
        return examenAdmision;
    }

    public void setExamenAdmision(ExamenAdmision examenAdmision) {
        this.examenAdmision = examenAdmision;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "fechaNacimiento=" + fechaNacimiento +
                ", activo=" + activo +
                ", carnet='" + carnet + '\'' +
                ", examenAdmision=" + examenAdmision +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
