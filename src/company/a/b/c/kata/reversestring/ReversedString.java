package company.a.b.c.kata.reversestring;

public class ReversedString {

    public static String solution(String str) {

        final StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse()
                .toString();

    }

}