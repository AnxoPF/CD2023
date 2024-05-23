package Ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FechaTest{

    private Fecha fechaCorrecta = new Fecha (20, 6, 2008);
    private Fecha mesMal1 = new Fecha (21, 0, 3000);   
    private Fecha mesMal2 = new Fecha (21, 13, 3000);
    private Fecha diaMal1 = new Fecha (0, 11, 2000);
    private Fecha diaMal2 = new Fecha (32, 11, 2000);
    private Fecha diaMalNoviembre = new Fecha (31, 11, 2000);
    private Fecha diaBienDiciembre = new Fecha (31, 12, 2000);
    private Fecha diaMalFebrero = new Fecha (30, 2, 2008);
    private Fecha diaBienFebreroBisiesto1 = new Fecha (29, 2, 2008);
    private Fecha diaBienFebreroBisiesto2 = new Fecha (29, 2, 2000);
    private Fecha diaMalFebreroBisiesto1 = new Fecha (29, 2, 2007);
    private Fecha diaMalFebreroBisiesto2 = new Fecha (29, 2, 1900);
    
    @Test
    public void testValidacion() {
        assertTrue(fechaCorrecta.validacionDiaMes());
        assertFalse(mesMal1.validacionDiaMes());
        assertFalse(mesMal2.validacionDiaMes());
        assertFalse(diaMal1.validacionDiaMes());
        assertFalse(diaMal2.validacionDiaMes());
        assertFalse(diaMalNoviembre.validacionDiaMes());
        assertTrue(diaBienDiciembre.validacionDiaMes());
        assertFalse(diaMalFebrero.validacionDiaMes());
        assertTrue(diaBienFebreroBisiesto1.validacionDiaMes());
        assertTrue(diaBienFebreroBisiesto2.validacionDiaMes());
        assertFalse(diaMalFebreroBisiesto1.validacionDiaMes());
        assertFalse(diaMalFebreroBisiesto2.validacionDiaMes());
    }
}