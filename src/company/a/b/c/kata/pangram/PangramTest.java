package company.a.b.c.kata.pangram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PangramTest {

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        Pangram pc = new Pangram();
        assertEquals(true, pc.check(pangram1));
    }



    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        Pangram pc = new Pangram();
        assertEquals(false, pc.check(pangram2));
    }
}