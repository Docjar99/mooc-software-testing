package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GHappyTest {

    @Test
    public void testGGEnMedio() {
        GHappy gHappy = new GHappy();
        assertEquals(true, gHappy.gHappy("xxggxx"));
    }

    @Test
    public void testGUnica() {
        GHappy gHappy = new GHappy();
        assertEquals(false, gHappy.gHappy("xxgxx")); // false
    }

    @Test
    public void testGGYUnaGSuelta() {
        GHappy gHappy = new GHappy();
        assertEquals(false, gHappy.gHappy("xxggyygxx")); // false
    }

    @Test
    public void testSoloGsFelices() {
        GHappy gHappy = new GHappy();
        assertEquals(true, gHappy.gHappy("gggggg"));
    }

    @Test
    public void testGAlInicioYSola() {
        GHappy gHappy = new GHappy();
        assertEquals(false, gHappy.gHappy("gxxgg")); //false
    }

    @Test
    public void testCadenaVacia() {
        GHappy gHappy = new GHappy();
        assertEquals(true, gHappy.gHappy(""));
    }

    @Test
    public void testSinGs() {
        GHappy gHappy = new GHappy();
        assertEquals(true, gHappy.gHappy("abcdef"));
    }
}
