package company.a.b.c.kata.Diamond;

public class Diamond {

    public static String print(int n) {
        return n <= 0 ? null : magic(n);
    }

    private static String magic(int n) {
        String result = "\n";
        int counter = 0;

        for (int i = 0; i < n; i++) {
            result = result + "*".repeat(n) + "\n";
        }
        return result;
    }

}