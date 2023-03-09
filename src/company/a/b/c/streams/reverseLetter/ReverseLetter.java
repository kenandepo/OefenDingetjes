package company.a.b.c.streams.reverseLetter;


public class ReverseLetter {

    public static String reverseLetter(final String str) {
        final String s = str.replaceAll("[^a-z]", "");
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse()
                .toString();
    }
}
