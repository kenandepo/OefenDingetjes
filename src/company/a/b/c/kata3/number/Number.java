package company.a.b.c.kata3.number;

public class Number {
    public boolean isEven(double n) {
        if (n == 0) {
            return true;
        }
        return n % 2 == 0;
    }
}
