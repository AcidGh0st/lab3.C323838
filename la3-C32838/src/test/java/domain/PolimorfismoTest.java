package domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestPolimorfismo  {

    @org.junit.jupiter.api.Test
    void son_diferentes_test() {

        // Crear objetos de las clases derivadas
        Persona persona1 = new Estudiante("Juan", "123", "2000-01-01", true);
        Persona persona2 = new Estudiante("María", "456", "2001-02-02", false);

        // Llamar al método equals polimórfico
        boolean sonIguales = persona1.equals(persona2);

        // Verificar que los objetos sean diferentes
        assertFalse(sonIguales);


    }

    @org.junit.jupiter.api.Test
    void son_iguales_test() {

        // Crear objetos de las clases derivadas
        Persona persona1 = new Estudiante("Juan", "123", "2000-01-01", true);
        Persona persona2 = new Estudiante("Juan", "123", "2000-01-01", true);

        // Llamar al método equals polimórfico
        boolean sonIguales = persona1.equals(persona2);

        // Verificar que los objetos sean diferentes
        assertTrue(sonIguales);


    }
}