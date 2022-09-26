package company.a.b.c.kata.countsheeps;
//Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
public class CountSheeps {

        public int countSheeps(Boolean[] arrayOfSheeps) {
            int totalNum = 0;

            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (  arrayOfSheeps[i]!=null && true == (arrayOfSheeps[i])) {
                    totalNum = totalNum + 1;
                }

            }
            return totalNum;
        }
}
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//
//public class CounterTest {
//    Boolean[] array1 = {true,  true,  true,  false,
//                      true,  true,  true,  true ,
//                      true,  false, true,  false,
//                      true,  false, false, true ,
//                      true,  true,  true,  true ,
//                      false, false, true,  true };
//
//    @Test
//    public void test() {
//      assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
//    }
//}