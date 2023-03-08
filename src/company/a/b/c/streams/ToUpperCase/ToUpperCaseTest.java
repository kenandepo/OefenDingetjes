package company.a.b.c.streams.ToUpperCase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ToUpperCaseTest {

    @Test
    void test() {
        final List<String> input = List.of("jan, hans, djonie,sjaak");

        final List<String> result = ToUpperCase.transform(input);

        assertEquals(List.of("JAN, HANS, DJONIE,SJAAK"), result);
    }

}
