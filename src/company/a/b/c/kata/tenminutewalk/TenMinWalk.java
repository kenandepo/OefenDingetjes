package company.a.b.c.kata.tenminutewalk;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        if (walk.length < 10 || walk.length > 10) {
            return false;
        }
        if (walk.length % 2 != 0) {
            return false;
        }
        int n = 0;
        int s = 0;
        int e = 0;
        int w = 0;

        for (char c : walk) {
            if (c == 'n') {
                n++;
            }
            if (c == 's') {
                s++;
            }
            if (c == 'e') {
                e++;
            }
            if (c == 'w') {
                w++;
            }
        }
        return n == s && e == w;
    }

}
