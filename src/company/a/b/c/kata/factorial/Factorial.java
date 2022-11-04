package company.a.b.c.kata.factorial;

public class Factorial {

    public int factorial(int n) {

        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
        int sum = n;
        for (int i = 1; i < n; i++) {
            sum = sum * i;
        }

        return sum == 0 ? 1 : sum;

    }
}