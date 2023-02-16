package company.a.b.c.streams.uppercase;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCase {

    public static Collection<String> dao(String... names) {

        return Stream.of(names).map(s -> s.toUpperCase()).collect(Collectors.toList());

    }
}
