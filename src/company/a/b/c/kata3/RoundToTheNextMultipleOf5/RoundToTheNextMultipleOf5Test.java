package company.a.b.c.kata3.RoundToTheNextMultipleOf5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RoundToTheNextMultipleOf5Test {

    @Test
    public void basicTests() {
        int[][] arr = {
                { 0, 0 }, { 1, 5 }, { 3, 5 }, { 5, 5 }, { 7, 10 }, { 39, 40 } };
        Arrays.stream(arr).forEach((testCase) -> {
            assertEquals( testCase[0], testCase[1], RoundToTheNextMultipleOf5.roundToNext5(testCase[0]));
        });
    }

}
