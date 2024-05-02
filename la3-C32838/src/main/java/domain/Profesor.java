package domain;

import java.util.ArrayList;
import java.util.List;

class Profesor extends Persona {
    private String telefono;
    private int salario;
    private double cargaAcademica;
    private String rango;

    public Profesor(String nombre, String identificacion, String telefono, int salario, double cargaAcademica, String rango) {
        super(nombre, identificacion);
        this.telefono = telefono;
        this.salario = salario;
        this.cargaAcademica = cargaAcademica;
        this.rango = rango;
    }
}
