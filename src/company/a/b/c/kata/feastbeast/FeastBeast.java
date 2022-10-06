package company.a.b.c.kata.feastbeast;

public class FeastBeast {

    public static boolean feast(String beast, String dish) {

        final int lengthOfBeast = beast.length();
        final int lengthOfDish = dish.length();

        return (beast.charAt(0) == beast.charAt(0) && beast.charAt(lengthOfBeast - 1) == dish.charAt(lengthOfDish - 1));

    }

}
