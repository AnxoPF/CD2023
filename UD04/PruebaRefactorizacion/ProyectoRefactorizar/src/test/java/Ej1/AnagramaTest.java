package Ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramaTest{

    @Test
    public void testAnagramas(){
        assertTrue(Anagrama.SonAnagrama("lava", "vala"));
        assertTrue(Anagrama.SonAnagrama("Rail", "Liar"));
        assertTrue(Anagrama.SonAnagrama("perro y gato", "gorro y peta"));
        assertTrue(Anagrama.SonAnagrama("Arreglar", "Regalarr"));

        assertFalse(Anagrama.SonAnagrama("hola", "adie"));
        assertFalse(Anagrama.SonAnagrama("espacio", "espacio "));
        assertFalse(Anagrama.SonAnagrama("peste", "pestes"));

    }

}