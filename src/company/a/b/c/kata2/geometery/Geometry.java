package company.a.b.c.kata2.geometery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Geometry {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {

        final int i = (age1 * age1) + (age2 * age2) + (age3 * age3) + (age4 * age4) + (age5 * age5) + (age6 * age6) + (age7 * age7) + (age8 * age8);
        final double sqrt = Math.sqrt(i);
        return (int) (sqrt / 2);
    }
}
//other solution
// return (int) Math.sqrt(of(ages).map(a->a*a).sum())/2;
