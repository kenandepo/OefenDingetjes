package company.a.b.c.kata.findSmallestInt;
//Find the smallest integer in the array¬
import java.util.ArrayList;
import java.util.Collections;

public class findSmallestInt {

    public static int findSmallestInt(int[] args) {

        final ArrayList integers = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            integers.add(args[i]);
        }
        Collections.sort(integers);
        return (int) integers.get(0);
    }
}
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class SmallestIntegerFinderTest {
//
//    @Test
//    public void example1(){
//        int expected = 11;
//        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void example2(){
//        int expected = -33;
//        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,8,-33});
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void example3(){
//        int expected = Integer.MIN_VALUE;
//        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
//        assertEquals(expected, actual);
//    }
//}