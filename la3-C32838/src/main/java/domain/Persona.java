package domain;

abstract class Persona {
    protected String nombre;
    protected String identificacion;

    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    // Método equals en la superclase Persona
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) obj;
        return identificacion.equals(persona.identificacion);
    }
}

