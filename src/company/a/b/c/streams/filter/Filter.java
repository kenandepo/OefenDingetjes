package company.a.b.c.streams.filter;

import java.util.List;

public class Filter {

    public static List<String> filtermBoy(List<String> input) {
        return input.stream()
                .filter((Filter::filterUnwantedValues))
                .toList();

    }

    private static boolean filterUnwantedValues(String input) {
        return "My".equals(input) || input.equals("is") || input.equals("Doe");
    }
}
