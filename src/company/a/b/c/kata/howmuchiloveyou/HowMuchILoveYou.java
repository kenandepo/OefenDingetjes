package company.a.b.c.kata.howmuchiloveyou;

public class HowMuchILoveYou {

    public static String howMuchILoveYou(int nb_petals) {
        final int i = nb_petals % 6;
        if (i == 1) {
            return "I love you";
        }
        ;
        if (i == 2) {
            return "a little";
        }
        if (i == 3) {
            return "a lot";
        }
        if (i == 4) {
            return "passionately";
        }
        if (i == 5) {
            return "madly";
        } else {
            return "not at all";
        }
    }

}
