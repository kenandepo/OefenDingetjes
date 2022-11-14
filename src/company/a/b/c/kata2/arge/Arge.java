package company.a.b.c.kata2.arge;

public class Arge {

    public static int nbYear(int startSum, double percentage, int numberPerYear, int endTotal) {

        int counter = 0;
        double per = 1 + (percentage / 100);

        do {
            counter++;
            startSum = (int) ((startSum * per) + numberPerYear);
        } while (startSum < endTotal);

        return counter;
    }

}