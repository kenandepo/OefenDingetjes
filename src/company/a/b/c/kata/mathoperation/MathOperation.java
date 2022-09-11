package company.a.b.c.kata.mathoperation;

public class MathOperation {

    public static double operation(final String operation, final double input1, final double input2) {

        if ("+".equals(operation)) {
            return input1 + input2;
        }
        if ("-".equals(operation)) {
            return input1 - input2;
        }
        if ("*".equals(operation)) {
            return input1 * input2;
        }
        if ("/".equals(operation)) {
            return input1 / input2;
        }

        return 0;
    }
}