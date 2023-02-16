package company.a.b.c.streams.lettercount;

import java.util.stream.Stream;

public class LetterCount {

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Stream.of(names)
                .filter(l -> l.length() > 5)
                .mapToInt(n -> n.length())
                .sum();
    }
}
