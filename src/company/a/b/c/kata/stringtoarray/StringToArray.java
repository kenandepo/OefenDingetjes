package company.a.b.c.kata.stringtoarray;

public class StringToArray {

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

}

//import org.junit.Test;
//import static org.junit.Assert.assertArrayEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest {
//    @Test
//    public void basicTests() {
//        assertArrayEquals(new String[]{"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
//        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Solution.stringToArray("I love arrays they are my favorite"));
//    }
//}