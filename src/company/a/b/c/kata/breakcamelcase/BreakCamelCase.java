package company.a.b.c.kata.breakcamelcase;


public class BreakCamelCase {

    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
        //todo werking van $ sign uitzoeken
    }
}



