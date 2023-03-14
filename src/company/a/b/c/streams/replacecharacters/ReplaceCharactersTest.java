package company.a.b.c.streams.replacecharacters;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReplaceCharactersTest {

    @Test
    public void testSomething() {
        assertEquals("abc", ReplaceCharacters.switcheroo("bac"));
        assertEquals("ccc", ReplaceCharacters.switcheroo("ccc"));
        assertEquals("aaabcccbaaa", ReplaceCharacters.switcheroo("bbbacccabbb"));
    }
}

