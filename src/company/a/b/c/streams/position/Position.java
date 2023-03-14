package company.a.b.c.streams.position;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Position {

    public static String position(char alphabet) {

        final Map<String, Integer> map = new HashMap<>();

        final List<String> valueList = new ArrayList<>();
        final List<Integer> keylist = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            keylist.add(i);
        }
        for (char c = 'a'; c < 'z'; c++) {
            valueList.add(String.valueOf(c));
        }
        for (int i = 0; i < keylist.size(); i++) {
            map.put(valueList.get(i), keylist.get(i));
        }

        return "Position of alphabet: " + map.get(String.valueOf(alphabet));
    }
}
