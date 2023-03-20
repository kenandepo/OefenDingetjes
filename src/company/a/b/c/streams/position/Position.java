package company.a.b.c.streams.position;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Position {

    public static String position(char alphabet) {

        Map<Character, Integer> map = IntStream.rangeClosed('A', 'Z')
                .boxed()
                .collect(Collectors.toMap(x -> (char) x.intValue(), x -> x + (1 - 'A')));
        return "Position of alphabet: " + map.get(String.valueOf(alphabet));
    }
}
