package company.a.b.c.kata3.CodeWars;

public class CodeWars {

    public static int strCount(String str, char letter) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i))
                    .equals(String.valueOf(letter))) {
                count++;
            }
        }
        return count;
    }
}
