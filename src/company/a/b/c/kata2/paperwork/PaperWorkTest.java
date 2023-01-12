package company.a.b.c.kata2.paperwork;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaperWorkTest {

    @Test
    public void test1() {
        assertEquals(25, PaperWork.paperWork(5, 5));
    }

    @Test
    public void test2() {
        assertEquals(0, PaperWork.paperWork(5, -5));
    }

    @Test
    public void test3() {
        assertEquals(0, PaperWork.paperWork(-5, -5));
    }

    @Test
    public void test4() {
        assertEquals(0, PaperWork.paperWork(-5, 5));
    }

    @Test
    public void test5() {
        assertEquals(0,PaperWork.paperWork(5, 0));
    }
}
