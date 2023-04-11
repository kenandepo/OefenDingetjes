package company.a.b.c.kata3.GiftSorter;

import java.util.Arrays;

public class GiftSorter {

    public String sortGiftCode(String code) {
        char charArray[] = code.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}
