package company.a.b.c.kata.yesorno;

public class YesOrNo {

    public static String boolToWord(boolean b) {
        if (b) {
            return "Yes";
        } else {
            return "No";
        }
    }

}

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class BoolTest {
//    @Test
//    public void testBoolToWord() {
//        assertEquals(YesOrNo.boolToWord(true),"Yes");
//        assertEquals(YesOrNo.boolToWord(false),"No");
//    }
//}