package company.a.b.c.kata.duplicateencoder;

import com.google.common.base.CharMatcher;

public class DuplicateEncoder {

    static String encode(String word) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
             int matches = CharMatcher.is(word.toLowerCase().charAt(i))
                    .countIn(word.toLowerCase());

            if (matches == 1) {
                result = result + "(";
            } if (matches > 1) {
                result = result + ")";
            }
            matches=0;
        }

        return result;
    }
}
