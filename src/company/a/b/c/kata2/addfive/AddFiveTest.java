package company.a.b.c.kata2.addfive;

import org.junit.jupiter.api.Test;

import company.a.b.c.kata.repeatString.Solution;

import static org.junit.jupiter.api.Assertions.*;

class AddFiveTest {

    @Test
    public void testAddFive() {
        assertEquals(10, AddFive.addFive(5));
    }
    @Test
    public void testAddZero() {
        assertEquals(5, AddFive.addFive(0));
    }
    @Test
    public void testAddNegativeFive() {
        assertEquals(0, AddFive.addFive(-5));
    }
    @Test
    public void testRandom() {
        for (int i = 0; i < 50; i++) {
            int rand = (int)(Math.random() * 1000) + 1;
            assertEquals(rand+5, AddFive.addFive(rand));
        }
    }
}