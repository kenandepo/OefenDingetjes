package company.a.b.c.kata2.fixcase;

public class FixCase {
    public static String solve(final String str) {
        return str.chars().filter(Character::isLowerCase).count() >= str.chars().filter(Character::isUpperCase).count() ? str.toLowerCase() : str.toUpperCase();
    }
}
