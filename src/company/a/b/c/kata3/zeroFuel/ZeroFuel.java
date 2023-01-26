package company.a.b.c.kata3.zeroFuel;

public class ZeroFuel {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        return !(distanceToPump - (fuelLeft * mpg) > 0);
    }

}
