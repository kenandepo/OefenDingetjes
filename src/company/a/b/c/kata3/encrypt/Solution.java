package company.a.b.c.kata3.encrypt;

public class Solution {
    public static String[] capitalize(String s) {
        String[] result = new String[2];
        String caps = "";
        String lows = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                caps = caps + String.valueOf(s.charAt(i)).toUpperCase();
            }
            if (i % 2 != 0)
                caps = caps + String.valueOf(s.charAt(i)).toLowerCase();
        }

        result[0] = caps;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                lows = lows + String.valueOf(s.charAt(i)).toLowerCase();
            }
            if (i % 2 != 0)
                lows = lows + String.valueOf(s.charAt(i)).toUpperCase();
        }

        result[1] = lows;
        return result;
    }
}
