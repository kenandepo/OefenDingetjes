package company.a.b.c.streams.xo;

public class NumberOfXO {
    public static boolean getXOequal(String str) {

        if (!str.contains("x") && (!str.contains("o"))) {
            return true;
        }
        int numberOfX = 0;
        int numberOfo = 0;

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase("x")) {
                numberOfX++;
            }
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase("o")) {
                numberOfo++;
            }
        }
        return numberOfX == numberOfo;
    }
}
