package towerbuilder;

public class TowerBuilder {
    //TODO finish this one

    public static String[] towerBuilder(int nFloors) {
        StringBuilder stringBuilder = new StringBuilder();

        final String[] result = new String[nFloors];

        int totalCharacters = nFloors + 2;

        //input

        String subResult = "";
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                result[i] = "*";
            } else {

                for (int j = 0; j < i + 2; j++) {
                    stringBuilder.append("*");
                }
                result[i] = subResult;
            }
        }

        return result;
    }

}