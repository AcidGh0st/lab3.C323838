package domain;

import java.time.LocalDate;

class ExamenAdmision {
    private int numeroExamen;
    private double notaObtenida;
    private LocalDate fechaRealizacion;

    public ExamenAdmision(int numeroExamen, double notaObtenida, LocalDate fechaRealizacion) {
        this.numeroExamen = numeroExamen;
        this.notaObtenida = notaObtenida;
        this.fechaRealizacion = fechaRealizacion;
    }

    public int getNumeroExamen() {
        return numeroExamen;
    }

    public void setNumeroExamen(int numeroExamen) {
        this.numeroExamen = numeroExamen;
    }

    public double getNotaObtenida() {
        return notaObtenida;
    }

    public void setNotaObtenida(double notaObtenida) {
        this.notaObtenida = notaObtenida;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    @Override
    public String toString() {
        return "ExamenAdmision{" +
                "numeroExamen=" + numeroExamen +
                ", notaObtenida=" + notaObtenida +
                ", fechaRealizacion=" + fechaRealizacion +
                '}';
    }
}
