package company.a.b.c.kata.stringendswith;

//Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
//
//Examples:
//
//solution('abc', 'bc') // returns true
//solution('abc', 'd') // returns false
public class StringEndsWith {

    public static void main(String[] args) {
        solution("sumo", "omo");
    }

    public static boolean solution(String str, String ending) {
        final int difference = str.length() - ending.length();
        if (str.length() < ending.length()) {
            return false;
        }
        StringBuilder stringBuilder1 = new StringBuilder(str);
        StringBuilder stringBuilder2 = new StringBuilder(ending);

        stringBuilder1.delete(0, difference);

        if (stringBuilder1.toString()
                .equals(stringBuilder2.toString())) {
            return true;
        } else {
            return false;
        }

    }
}

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//// TODO: Replace examples and use TDD development by writing your own tests
//
//public class SolutionTest {
//    @Test
//    public void staticTests() {
//        check("samurai", "ai", true);
//        check("sumo", "omo", false);
//        check("ninja", "ja", true);
//        check("sensei", "i", true);
//        check("samurai", "ra", false);
//        check("abc", "abcd", false);
//        check("abc", "abc", true);
//        check("abcabc", "bc", true);
//        check("ails", "fails", false);
//        check("fails", "ails", true);
//        check("this", "fails", false);
//        check("this", "", true);
//        check(":-)", ":-(", false);
//        check("!@#$%^&*() :-)", ":-)", true);
//        check("abc\n", "abc", false);
//    }
//
//    private static void check(String str, String ending, boolean expected) {
//      boolean result = Kata.solution(str, ending);
//      assertEquals("Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected, expected, result);
//    }
//}