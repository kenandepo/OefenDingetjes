package company.a.b.c.kata.money;

public class Money {

    public static int calculateYears(double principal, double interest, double tax, double desired) {

        if (principal >= desired) {
            return 0;
        }
        int years = 0;

        while (principal < desired) {
            principal = principal + principal * interest * (1 - tax);

            years++;
        }
        return years;
    }
}

