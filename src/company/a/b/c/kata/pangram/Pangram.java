package company.a.b.c.kata.pangram;

import java.util.HashMap;

public class Pangram {

    public boolean check(String sentence) {

        final String input = sentence.toLowerCase()
                .replace(" ", "")
                .replace(".", "");
        HashMap<Character, Character> alphabetMap = new HashMap<>();

        for (char ch = 'a'; ch <= 'z'; ++ch) {
            alphabetMap.put(ch, ch);
        }

        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            if (alphabetMap.containsKey(key)) {
                alphabetMap.remove(key);
            }
        }
        return alphabetMap.size() == 0 ? true : false;
        //appaerently another way to solve it
        //return input.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}



