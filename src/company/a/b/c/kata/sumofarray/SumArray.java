package company.a.b.c.kata.sumofarray;

public class SumArray {

    public static double sum(double[] numbers) {

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}