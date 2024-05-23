/**
 * Clase EstudianteTest probar la funcionalidad de la clase Estudiante.
 */
package mesi;

/*
 * Importamos las librerías necesarias. 
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class EstudianteTest {

    /**
     * Prueba el método cuando la calificación es inferior a cinco.
     */
    @Test
    public void testAprobo_CalificacionMenorQueCinco() {
        Estudiante estudiante = new Estudiante("Juan", 20);
        estudiante.setCalificacion(4.5);
        assertFalse(estudiante.aprobo());
    }

    /**
     * Prueba el método cuando la calificación es igual a cinco.
     */
    @Test
    public void testAprobo_CalificacionIgualACinco() {
        Estudiante estudiante = new Estudiante("Maria", 22);
        estudiante.setCalificacion(5.0);
        assertTrue(estudiante.aprobo());
    }

    /**
     * Prueba el método cuando la calificación es superior a cinco.
     */
    @Test
    public void testAprobo_CalificacionMayorQueCinco() {
        Estudiante estudiante = new Estudiante("Pedro", 19);
        estudiante.setCalificacion(8.5);
        assertTrue(estudiante.aprobo());
    }

    /**
     * Prueba el método cuando la edad es divisible por doce.
     */
    @Test
    public void testEdadEscolar() {
        Estudiante estudiante = new Estudiante("Ana", 8);
        assertEquals(0, estudiante.edadEscolar());
    }

    /**
     * Prueba el método cuando la edad no es divisible por doce.
     */
    @Test
    public void testEdadEscolar_EdadNoDivisiblePorDoce() {
        Estudiante estudiante = new Estudiante("Carlos", 14);
        assertEquals(1, estudiante.edadEscolar());
    }

    /**
     * Prueba el método cuando la edad es menor que dieciocho.
     */
    @Test
    public void testEsUniversitario_EdadMenorQueDieciocho() {
        Estudiante estudiante = new Estudiante("Luisa", 17);
        assertFalse(estudiante.esUniversitario());
    }

    /**
     * Prueba el método cuando la edad es igual a dieciocho.
     */
    @Test
    public void testEsUniversitario_EdadDieciocho() {
        Estudiante estudiante = new Estudiante("Santiago", 18);
        assertTrue(estudiante.esUniversitario());
    }

    /**
     * Prueba el método que imprime los datos del estudiante.
     */
    @Test
    public void testImprimirInformacion() {
        Estudiante estudiante = new Estudiante("Laura", 21);
        estudiante.setCalificacion(6.8);

        estudiante.imprimirInformacion();
    }
}
