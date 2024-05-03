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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "sigla='" + sigla + '\'' +
                ", nombreCurso='" + nombreCurso + '\'' +
                ", numeroCreditos=" + numeroCreditos +
                '}';
    }
}
