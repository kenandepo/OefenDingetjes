package company.a.b.c.bankingkata;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        final String[] s = name.toUpperCase()
                .split(" ");

        s[0] = s[0].substring(0, 1);
        s[1] = s[1].substring(0, 1);

        String initials = s[0] + "." + s[1];

        return initials;
    }
}
