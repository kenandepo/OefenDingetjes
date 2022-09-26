package company.a.b.c.kata.findshortestword;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindShort {

    public static int findShort(String s) {

        final String[] stringArray = s.split(" ");
        final List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < stringArray.length; i++) {
            integers.add(Integer.valueOf(stringArray[i].length()));
        }
        Collections.sort(integers);

        return integers.get(0);
    }
}
//public class KataTest {
//    @Test
//    public void findShort() throws Exception {
//        assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
//        assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
//        assertEquals(2, Kata.findShort("Let's travel abroad shall we"));
//    }
//
//}