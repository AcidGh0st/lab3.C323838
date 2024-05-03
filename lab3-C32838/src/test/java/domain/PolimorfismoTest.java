package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
class PolimorfismoTest {

    @org.junit.jupiter.api.Test
    void estudiantes_son_diferentes_test() {

        // Crea objetos ExamenAdmision
        ExamenAdmision examenAdmision1 = new ExamenAdmision(1, 85.5,
                LocalDate.of(2000,2,3));
        ExamenAdmision examenAdmision2 = new ExamenAdmision(2, 90,
                LocalDate.of(2001,3,10));

        //Crea cursos
        Curso curso1 = new Curso("MO2", "Calculo", 4);
        Curso curso2 = new Curso("EC9", "Economia", 3);

        //Crea carreras
        Carrera carrera1 = new Carrera("PG0", "Programacion", Arrays.asList(curso1));
        Carrera carrera2 = new Carrera("ADM", "Administracion", Arrays.asList(curso2));

        //Crea objetos Estudiante
        Persona persona1 = new Estudiante("Juan", "Lopez Fallas", LocalDate.of(2000, 1,
                1), carrera1,true, "C32", examenAdmision1);
        Persona persona2 = new Estudiante("María", "Sanchez Jimenez", LocalDate.of(2001, 2,
                2), carrera2,false, "C328", examenAdmision2);

        //Llama al método equals polimórfico
        boolean sonIguales = persona1.equals(persona2);

        //Verifica que los objetos sean diferentes
        assertFalse(sonIguales);
    }

    @org.junit.jupiter.api.Test
    void estudiantes_son_iguales_test() {

        //Crea objeto ExamenAdmision
        ExamenAdmision examenAdmision1 = new ExamenAdmision(1, 85.5,
                LocalDate.of(2000,2,3));

        //Crea curso
        Curso curso1 = new Curso("MO2", "Calculo", 4);

        //Crea objetos carrera
        Carrera carrera1 = new Carrera("PG0","Programacion", Arrays.asList(curso1));
        Carrera carrera2 = new Carrera("PG0","Programacion", Arrays.asList(curso1));

        //Crea objetos Estudiante
        Persona persona1 = new Estudiante("Juan", "Lopez Fallas", LocalDate.of(2000, 1, 1),
                carrera1,true, "C32", examenAdmision1);
        Persona persona2 = new Estudiante("Juan", "Lopez Fallas", LocalDate.of(2000, 1, 1),
                carrera2,true, "C32", examenAdmision1);

        // Llama al método equals polimórfico
        boolean sonIguales = persona1.equals(persona2);

        // Verifica que los objetos sean iguales
        assertTrue(sonIguales);
    }

    @org.junit.jupiter.api.Test
    void docentes_son_iguales_test() {

        // Crea objetos Docente
        Persona persona1 = new Docente("James", "Sanabria Coto", "20008899",
                "D43", 250000, 0.6, "Maestria");
        Persona persona2 = new Docente("James", "Sanabria Coto", "20008899",
                "D43", 250000, 0.6, "Maestria");

        // Llama al método equals polimórfico
        boolean sonIguales = persona1.equals(persona2);

        // Verifica que los objetos sean iguales
        assertTrue(sonIguales);
    }

    @org.junit.jupiter.api.Test
    void docentes_son_diferentes_test() {

        // Crea objetos Docente
        Persona persona1 = new Docente("James", "Sanabria Coto", "20008899",
                "D43", 250000, 0.6, "Maestria");
        Persona persona2 = new Docente("Luis", "Vargas Rojas", "29228899",
                "K93", 350000, 0.2, "Master");

        // Llama al método equals polimórfico
        boolean sonIguales = persona1.equals(persona2);

        // Verifica que los objetos sean diferentes
        assertFalse(sonIguales);
    }

    @org.junit.jupiter.api.Test
    void carreras_son_diferentes_test() {

        //Crea cursos
        Curso curso1 = new Curso("MO2", "Calculo", 4);
        Curso curso2 = new Curso("EC9", "Economia", 3);

        //Crea carrera
        Carrera carrera1 = new Carrera("PG0", "Programacion", Arrays.asList(curso1));
        Carrera carrera2 = new Carrera("ADM", "Administracion", Arrays.asList(curso2));

        // Llama al método equals polimórfico
        boolean sonIguales = carrera1.equals(carrera2);

        // Verifica que los objetos sean diferentes
        assertFalse(sonIguales);
    }

    @org.junit.jupiter.api.Test
    void carreras_son_iguales_test() {

        //Crea cursos
        Curso curso1 = new Curso("MO2", "Calculo", 4);

        //Crea carrera
        Carrera carrera1 = new Carrera("PG0", "Programacion", Arrays.asList(curso1));
        Carrera carrera2 = new Carrera("PG0", "Programacion", Arrays.asList(curso1));

        // Llama al método equals polimórfico
        boolean sonIguales = carrera1.equals(carrera2);

        //Verifica que los objetos sean iguales
        assertTrue(sonIguales);
    }
}