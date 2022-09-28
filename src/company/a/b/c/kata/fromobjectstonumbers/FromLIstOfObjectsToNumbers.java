package company.a.b.c.kata.fromobjectstonumbers;

import java.util.ArrayList;
import java.util.List;

//In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
public class FromLIstOfObjectsToNumbers {

    public static List<Object> filterList(final List<Object> list) {

        final List<Object> numbers = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            try {
                Number n = (Number) list.get(i);
                numbers.add(n);
            } catch (Exception e) {
            }
        }
        return numbers;

    }
}

//import java.util.List;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class ExampleTests {
//
//  @Test
//  public void examples() {
//    assertEquals(List.of(1, 2), Kata.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
//    assertEquals(List.of(1, 0, 15), Kata.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
//    assertEquals(List.of(1, 2, 123), Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
//  }
//}