package company.a.b.c.kata.twofightersonewinner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoFightersOneWinnerTest {

    @Test
    public void basicTests() {
        assertEquals("Lew", TwoFightersOneWinner.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", TwoFightersOneWinner.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", TwoFightersOneWinner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", TwoFightersOneWinner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", TwoFightersOneWinner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", TwoFightersOneWinner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }
}