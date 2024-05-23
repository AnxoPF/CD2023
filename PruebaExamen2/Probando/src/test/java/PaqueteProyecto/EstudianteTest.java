package PaqueteProyecto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest{
    
    @Test
    public void testCrearEstudiante(){
        Estudiante estudiante = new Estudiante("Pepe", 14);
        assertEquals("Pepe", estudiante.getNombre());
        assertEquals(13, estudiante.getEdad());
        assertEquals(0.0, estudiante.getCalificacion());
    }

    @Test
    public void testSetCalificacion(){
        Estudiante estudiante = new Estudiante("Manuel", 20);
        estudiante.setCalificacion(6.6);
        assertEquals(6.6, estudiante.getCalificacion());
    }

    @Test
    public void testAprobo(){
        Estudiante estudianteAprobado = new Estudiante("María", 20);
        estudianteAprobado.setCalificacion(6.8);
        assertTrue(estudianteAprobado.aprobo());

        Estudiante estudianteSuspenso = new Estudiante("Paco", 20);
        estudianteSuspenso.setCalificacion(2.6);
        assertFalse(estudianteSuspenso.aprobo());
    }

    @Test
    public void testEsUniversitario(){
        Estudiante estudianteUniversitario = new Estudiante("Jose", 13);
        assertTrue(estudianteUniversitario.esUniversitario());

        Estudiante estudianteNoUniversitario = new Estudiante("Paula", 23);
        assertFalse(estudianteNoUniversitario.esUniversitario());
    }

    public void testEdadEscolar(){
        Estudiante estudianteEdadEscolar = new Estudiante("Xavi", 10);
        assertEquals(0, estudianteEdadEscolar.edadEscolar());
    }

}
