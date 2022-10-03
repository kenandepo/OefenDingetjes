package company.a.b.c.kata.casesensitive;

public class CaseSensitive {

    public static String doubleChar(String s) {

        String subRestult = "";

        for (int i = 0; i < s.length(); i++) {
            subRestult = subRestult + s.charAt(i) + s.charAt(i);
        }
        return subRestult;
    }
}