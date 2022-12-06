package company.a.b.c.kata2.high;

import java.util.HashMap;

public class High {
//    Given a string of words, you need to find the highest scoring word.
//
//    Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//    You need to return the highest scoring word as a string.
//
//    If two words score the same, return the word that appears earliest in the original string.
//
//    All letters will be lowercase and all inputs will be valid.
    public static String high(String s) {

        final HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

        int pointsOfLetter = 0;

        for (char ch = 'a'; ch <= 'z'; ++ch) {
            characterIntegerHashMap.put(ch, pointsOfLetter);
            pointsOfLetter++;
        }

        final String[] splittedInputWords = s.split(" ");

        final HashMap<String, Integer> mappedValueList = new HashMap<>();
        int scoreOfWord = 0;

        for (int i = 0; i < splittedInputWords.length; i++) {
            scoreOfWord = scoreOfWord + characterIntegerHashMap.get(splittedInputWords[pointsOfLetter].charAt(i));
        }

    }

}