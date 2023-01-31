package company.a.b.c.kata3.AgeDiff;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        if (birth == yearTo) {
            return "You were born this very year!";
        }

        if (birth < yearTo) {
            final int years = yearTo - birth;
            if (years <= 1) {
                return "You are " + years + " year old.";
            }
            return "You are " + years + " years old.";
        } else {
            final int years = birth - yearTo;
            if (years <= 1) {
                return "You will be born in " + years + " year.";
            }
            return "You will be born in " + years + " years.";
        }
    }
}
