package company.a.b.c.kata.digitize;

public class Digitize {

    public static int[] digitize(long n) {

        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
// unlucked solution with this one
    }
}