package PaquetePrueba;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EstudianteTest {

    @Test
    public void testCrearEstudiante() {
        Estudiante estudiante = new Estudiante("Juan", 15);
        assertEquals("Juan", estudiante.getNombre());
        assertEquals(15, estudiante.getEdad());
        assertEquals(0.0, estudiante.getCalificacion(), 0.01);
    }

    @Test
    public void testSetCalificacion() {
        Estudiante estudiante = new Estudiante("Maria", 17);
        estudiante.setCalificacion(7.5);
        assertEquals(7.5, estudiante.getCalificacion(), 0.01);
    }

    @Test
    public void testAprobo() {
        Estudiante estudianteAprobado = new Estudiante("Pedro", 20);
        estudianteAprobado.setCalificacion(6.8);
        assertTrue(estudianteAprobado.aprobo());

        Estudiante estudianteReprobado = new Estudiante("Ana", 19);
        estudianteReprobado.setCalificacion(4.3);
        assertFalse(estudianteReprobado.aprobo());
    }

    @Test
    public void testEdadEscolar() {
        Estudiante estudiante = new Estudiante("Carlos", 10);
        assertEquals(0, estudiante.edadEscolar());
    }

    @Test
    public void testEsUniversitario() {
        Estudiante estudianteMenor = new Estudiante("Laura", 17);
        assertFalse(estudianteMenor.esUniversitario());

        Estudiante estudianteMayor = new Estudiante("Roberto", 22);
        assertTrue(estudianteMayor.esUniversitario());
    }
}
