package company.a.b.c.kata.jadencase;

public class ToJadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) {
            return null;
        }
        final String[] stringArrayInput = phrase.split(" ");
        final String[] resultArray = new String[stringArrayInput.length];

        for (int i = 0; i < stringArrayInput.length; i++) {

            String cap = stringArrayInput[i].substring(0, 1)
                    .toUpperCase() + stringArrayInput[i].substring(1);

            resultArray[i] = cap;
        }
        String result = "";
        for (int i = 0; i < resultArray.length; i++) {
            result = result + resultArray[i] + " ";
        }
        result = result.trim();
        return result;
    }

}