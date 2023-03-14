package company.a.b.c.streams.replacecharacters;

import java.util.stream.Stream;

public class ReplaceCharacters {

    public static String switcheroo(String input) {

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            result = result + convert(String.valueOf(input.charAt(i)));
        }
        return result;
    }

    public static String convert(String letter) {
        return letter.equals("a") ? "b" : letter.equals("b") ? "a" : letter;
    }
}
