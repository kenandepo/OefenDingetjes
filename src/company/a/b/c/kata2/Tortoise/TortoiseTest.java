package company.a.b.c.kata2.Tortoise;

import org.junit.jupiter.api.Test;

import company.a.b.c.kata.repeatString.Solution;

import static org.junit.jupiter.api.Assertions.*;

class TortoiseTest {

    @Test
    public void basicTests() {
        assertEquals("H!!",      Tortoise.replace("Hi!"));
        assertEquals("!H!! H!!", Tortoise.replace("!Hi! Hi!"));
        assertEquals("!!!!!",    Tortoise.replace("aeiou"));
        assertEquals("!BCD!",    Tortoise.replace("ABCDE"));
    }
}