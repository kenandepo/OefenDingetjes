package company.a.b.c.kata.twotoone;

import java.util.Arrays;

public class TwoToOne {

    public static String longest(String s1, String s2) {

        char s1_charArray[] = s1.toCharArray();
        char s2_charArray[] = s2.toCharArray();

        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            final String s = String.valueOf(s1_charArray[i]);
            if (!result.contains(s)) {
                result = result + s;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            final String s = String.valueOf(s2_charArray[i]);
            if (!result.contains(s)) {
                result = result + s;
            }
        }

        char resultCharArray[] = result.toCharArray();
        Arrays.sort(resultCharArray);

        String endResult = String.valueOf(resultCharArray);
        return endResult;
    }
}
