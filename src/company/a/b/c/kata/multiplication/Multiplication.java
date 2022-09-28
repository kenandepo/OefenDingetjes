package company.a.b.c.kata.multiplication;

//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
public class Multiplication {

    public static int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest {
//    @Test
//    public void test1() {
//        System.out.println("Checking for Odd numbers.");
//        assertEquals(9, Sid.simpleMultiplication(1));
//        assertEquals(27, Sid.simpleMultiplication(3));
//        assertEquals(189, Sid.simpleMultiplication(21));
//        assertEquals(207, Sid.simpleMultiplication(23));
//    }
//
//    @Test
//    public void test2() {
//        System.out.println("Checking for Even numbers.");
//        assertEquals(16, Sid.simpleMultiplication(2));
//        assertEquals(32, Sid.simpleMultiplication(4));
//        assertEquals(176, Sid.simpleMultiplication(22));
//        assertEquals(208, Sid.simpleMultiplication(26));
//    }
//}