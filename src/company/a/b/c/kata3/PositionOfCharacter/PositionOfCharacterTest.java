package company.a.b.c.kata3.PositionOfCharacter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionOfCharacterTest {

    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", PositionOfCharacter.position('a'));
        assertEquals("Position of alphabet: 26", PositionOfCharacter.position('z'));
        assertEquals("Position of alphabet: 5", PositionOfCharacter.position('e'));
    }
}
