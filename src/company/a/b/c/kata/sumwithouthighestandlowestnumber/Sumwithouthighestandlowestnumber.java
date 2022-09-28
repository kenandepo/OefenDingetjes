package company.a.b.c.kata.sumwithouthighestandlowestnumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
//
//The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
//
//Mind the input validation.
//
//Example
//{ 6, 2, 1, 8, 10 } => 16
//{ 1, 1, 11, 2, 3 } => 6
public class Sumwithouthighestandlowestnumber {

    public static int sum(int[] numbers) {
        if (numbers==null){
            return 0;
        }
        final List list = new ArrayList();
        Object temp = new Object();

        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i];
            if (!"null".equals(temp)) {
                list.add(numbers[i]);
            }
        }

        Collections.sort(list);
        final int size = list.size();

        if (list.size() > 1) {
            list.remove(size - 1);
            list.remove(0);
        }
        if (list.size()==1){
            list.remove(0);
        }

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += (int) list.get(i);
        }
        return sum;
    }
}
//TODO refactor needed :)

//public class SolutionTest {
//    @Test
//    public void BasicTests() {
//      assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
//    }
//}