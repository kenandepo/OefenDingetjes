package company.a.b.c.kata.feastbeast;

public class FeastBeast {

    public static boolean feast(String beast, String dish) {

        final int lengthOfBeast = beast.length();
        final int lengthOfDish = dish.length();

        if (lengthOfBeast < 1 || lengthOfDish < 1) {
            return false;
        }
        return (beast.charAt(0) == dish.charAt(0) && beast.charAt(lengthOfBeast - 1) == dish.charAt(lengthOfDish - 1));

    }

}
