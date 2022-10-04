package company.a.b.c.kata.twiceasold;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwiceAsOldTest {

    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOld.TwiceAsOld(30,0));
        assertEquals(16, TwiceAsOld.TwiceAsOld(30,7));
        assertEquals(15, TwiceAsOld.TwiceAsOld(45,30));
    }
}