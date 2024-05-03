package domain;

import java.util.Objects;

class Docente extends Persona {
    private String telefonoOficina;
    private String idDocente;
    private int salario;
    private double cargaAcademica;
    private String rango;

    public Docente(String nombre, String apellidos, String telefonoOficina, String idDocente, int salario, double cargaAcademica, String rango) {
        super(nombre, apellidos);
        this.telefonoOficina = telefonoOficina;
        this.salario = salario;
        this.cargaAcademica = cargaAcademica;
        this.rango = rango;
        this.idDocente = idDocente;
    }

    public String getTelefonoOficina() {
        return telefonoOficina;
    }

    public void setTelefonoOficina(String telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    public String getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public double getCargaAcademica() {
        return cargaAcademica;
    }

    public void setCargaAcademica(double cargaAcademica) {
        this.cargaAcademica = cargaAcademica;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Docente docente = (Docente) o;
        return salario == docente.salario && Double.compare(cargaAcademica, docente.cargaAcademica) == 0 && Objects.equals(telefonoOficina, docente.telefonoOficina) && Objects.equals(idDocente, docente.idDocente) && Objects.equals(rango, docente.rango);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefonoOficina, idDocente, salario, cargaAcademica, rango);
    }

    @Override
    public String toString() {
        return "Docente{" +
                "telefono='" + telefonoOficina + '\'' +
                ", idDocente='" + idDocente + '\'' +
                ", salario=" + salario +
                ", cargaAcademica=" + cargaAcademica +
                ", rango='" + rango + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
