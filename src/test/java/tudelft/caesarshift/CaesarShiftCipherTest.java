package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    @Test
    public void testDesplazamientoPositivo() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def", cipher.caesarShiftCipher("abc", 3)); // def
    }

    @Test
    public void testDesplazamientoNegativo() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.caesarShiftCipher("abc", -3)); // xyz
    }

    @Test
    public void testRotacionCompleta() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("abc", cipher.caesarShiftCipher("abc", 26)); // abc
    }

    @Test
    public void testCadenaConEspacios() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("d f", cipher.caesarShiftCipher("a c", 3)); // df
    }

    @Test
    public void testCaracteresInvalidos() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.caesarShiftCipher("abc123", 3)); // invalid
    }

    @Test
    public void testCadenaVacia() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("", cipher.caesarShiftCipher("", 3));
    }

    @Test
    public void testDesplazamientoNegativoMayor() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.caesarShiftCipher("abc", -29)); //xyz
    }
}
