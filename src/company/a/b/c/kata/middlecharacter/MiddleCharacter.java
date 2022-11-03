package company.a.b.c.kata.middlecharacter;

public class MiddleCharacter {

    public static String getMiddle(String word) {
        int lengthOfInput = word.length();

        return lengthOfInput % 2 == 0 ? returnTwoCharacters(word, lengthOfInput) : returnOneCharacter(word, lengthOfInput);

    }

    private static String returnOneCharacter(String input, int lenght) {
        return String.valueOf(input.charAt((lenght - 1) / 2));
    }

    private static String returnTwoCharacters(String input, int length) {
        final char c = input.charAt((length - 1) / 2);
        return String.valueOf(c) + (input.charAt(((length - 1) / 2) + 1));

    }
}