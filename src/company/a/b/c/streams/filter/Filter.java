package company.a.b.c.streams.filter;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<String> filtermBoy(List<String> input) {
        return input.stream()
                .filter(element -> element.equalsIgnoreCase("My") || element.equals("is") || element.equals("Doe"))
                .toList();

    }
}
