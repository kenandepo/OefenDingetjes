package company.a.b.c.kata.sentencesmash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmashWordsTest {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SmashWords.smash(new String[] {}));
    }


    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SmashWords.smash(new String[] {"Bilal"}));
    }

}
