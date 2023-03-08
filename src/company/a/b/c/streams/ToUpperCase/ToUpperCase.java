package company.a.b.c.streams.ToUpperCase;

import static java.util.stream.Collectors.toList;

import java.util.List;

public class ToUpperCase {

    public static List<String> transform(List<String> collection) {
        return collection.stream()
                .map(String::toUpperCase)
                .collect(toList());
    }
}
