package company.a.b.c.kata.sortandstar;

import java.util.Arrays;

public class SortAndStar {

    public static String twoSort(String[] s) {

        Arrays.sort(s);

        String firstStringInArray = s[0];

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < firstStringInArray.length(); i++) {
            stringBuilder.append(s[0].charAt(i) + "***");
        }

        return String.valueOf(stringBuilder.substring(0, stringBuilder.length() - 3));
    }
    //better sollution - >
//     java.util.Arrays.sort(s);
//
//        return String.join("***",s[0].split(""));
}