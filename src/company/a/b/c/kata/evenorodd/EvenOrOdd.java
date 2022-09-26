package company.a.b.c.kata.evenorodd;

//Create a function that takes an integer as an argument
// and returns "Even" for even numbers or "Odd" for odd numbers.
public class EvenOrOdd {

    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class EvenOrOddTest {
//    @Test
//    public void testEvenOrOdd() {
//        EvenOrOdd eoo = new EvenOrOdd();
//        assertEquals("Even", eoo.even_or_odd(6));
//        assertEquals("Odd", eoo.even_or_odd(7));
//        assertEquals("Even", eoo.even_or_odd(0));
//        assertEquals("Odd", eoo.even_or_odd(-1));
//    }
//}