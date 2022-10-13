package company.a.b.c.kata.xo;

public class XO {

    public static boolean getXO(String str) {

        int x_chars = 0;
        int o_chars = 0;

        for (int i = 0; i < str.length(); i++) {
            if ("x".equals(String.valueOf(str.toLowerCase().charAt(i)))) {
                x_chars++;
            }
            if ("o".equals(String.valueOf(str.toLowerCase().charAt(i)))) {
                o_chars++;
            }
        } return x_chars == o_chars;
    }
}