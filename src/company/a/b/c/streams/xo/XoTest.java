package company.a.b.c.streams.xo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class XoTest {

    @Test
    public void testSomething1() {
        assertEquals(true, NumberOfXO.getXOequal("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, NumberOfXO.getXOequal("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, NumberOfXO.getXOequal("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, NumberOfXO.getXOequal("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, NumberOfXO.getXOequal("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, NumberOfXO.getXOequal("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, NumberOfXO.getXOequal("Xxxxertr34"));
    }
}
