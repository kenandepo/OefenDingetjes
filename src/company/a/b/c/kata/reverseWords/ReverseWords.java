package company.a.b.c.kata.reverseWords;

import java.util.Arrays;
//todo
public class ReverseWords {

    public static String reverseWords(final String original) {
        final String[] stringArray = original.split(" ");

        String rev = new String();

        for (String s : stringArray) {
            rev = rev + reverse(s);

        }
        return rev;
    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}