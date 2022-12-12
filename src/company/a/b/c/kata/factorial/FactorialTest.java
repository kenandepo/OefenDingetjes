package company.a.b.c.kata.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {


    private Factorial fact =new Factorial();

//    @Before
//    public void initFactorial() {
//        fact = new Factorial();
//    }
//
//    @After
//    public void afterFactorial() {
//        fact = null;
//    }

    @Test
    public void test_factorial0() {
        assertEquals(1, fact.factorial(0));
    }

    @Test
    public void test_factorial3() {
        assertEquals(6, fact.factorial(3));
    }

    @Test
    public void test_factorial5() {
        assertEquals(120, fact.factorial(5));
    }
}