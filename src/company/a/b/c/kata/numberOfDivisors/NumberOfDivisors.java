package company.a.b.c.kata.numberOfDivisors;

public class NumberOfDivisors {

    public long numberOfDivisors(int n) {

        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result++;
            }

        }
        return result;
    }
}
