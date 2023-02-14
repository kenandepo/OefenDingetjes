package company.a.b.c.kata3.multiTable;

import java.util.ArrayList;
import java.util.List;

public class MultiTable {
    public static String multiTable(int num) {

        final List<String> resultList = new ArrayList<>();

        for (int i = 0; i < 11; i++) {

            int temp = num * i;
            resultList.add(i + " * " + num + " = " + temp);
        }
        resultList.remove(0);

        String response = "";

        for (int i = 0; i < resultList.size(); i++) {
            response = response + "\n" + resultList.get(i);

        }
        return response;
    }
}
