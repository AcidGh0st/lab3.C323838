package domain;

class Curso {
    private String sigla;
    private String nombreCurso;
    private int numeroCreditos;

    public Curso(String sigla, String nombreCurso, int numeroCreditos) {
        this.sigla = sigla;
        this.nombreCurso = nombreCurso;
        this.numeroCreditos = numeroCreditos;
    }
}
