package company.a.b.c.kata3.PositionOfCharacter;

import java.util.HashMap;
import java.util.Map;

public class PositionOfCharacter {

    public static String position(char alphabet) {
        final Map<String, Integer> map = new HashMap<>();
        int i = 1;

        for (char ch = 'a'; ch <= 'z'; ch++, i++) {
            map.put(String.valueOf(ch), i);
        }
        return "Position of alphabet: " + String.valueOf(map.get(String.valueOf(alphabet)
                .toLowerCase()));
    }
}
