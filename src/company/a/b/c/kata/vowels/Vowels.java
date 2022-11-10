package company.a.b.c.kata.vowels;


public class Vowels {

    public static int getCount(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i))
                    .equals("a") || String.valueOf(str.charAt(i))
                    .equals("e") || String.valueOf(str.charAt(i))
                    .equals("i") || String.valueOf(str.charAt(i))
                    .equals("o") || String.valueOf(str.charAt(i))
                    .equals("u")) {
                counter++;
            }
        }
        return counter;
    }
}
