package company.a.b.c.kata.toalternativestring;

import java.util.Locale;

public class ToAlternativeString {

    public static String toAlternativeString(String string) {

        final String[] stringArray = new String[string.length()];
        final String[] returnArray = new String[string.length()];
        final String regexCaps = "[A-Z]";

        for (int i = 0; i < string.length(); i++) {
            stringArray[i] = String.valueOf(string.charAt(i));
        }

        for (int i = 0; i < string.length(); i++) {
            if (stringArray[i].matches(regexCaps)) {
                returnArray[i] = stringArray[i].toLowerCase(Locale.ROOT);
            } else {
                returnArray[i] = stringArray[i].toUpperCase(Locale.ROOT);
            }
        }
        String result = "";
        for (int i = 0; i < returnArray.length; i++) {
            result = result + returnArray[i];
        }
        return result;
    }
}