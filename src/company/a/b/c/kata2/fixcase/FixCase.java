package company.a.b.c.kata2.fixcase;

public class FixCase {
    public static String solve(final String str) {
        int numberOfCapitalCharactersInInput = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                numberOfCapitalCharactersInInput++;
            }
        }
        if (numberOfCapitalCharactersInInput == 0) {
            return str.toLowerCase();
        }
        if (numberOfCapitalCharactersInInput > str.length() / 2) {
            return str.toUpperCase();
        }
        return str.toLowerCase();
    }
}
