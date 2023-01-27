package company.a.b.c.kata3.arithmetic;

public class Arithmetic {
    public static int arithmetic(int a, int b, String operator) {

        return operator.equals("add") ? a + b : operator.equals("subtract") ? a - b : operator.equals("multiply") ? a * b : a / b;

    }
}
