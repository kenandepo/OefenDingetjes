package company.a.b.c.streams.uppercase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

class UpperCaseTest {

    @Test
    void test() {
        final Collection<String> actual = UpperCase.dao("henk","ad");

        final Collection<String> expected = new ArrayList<>();
        expected.add("HENK");
        expected.add("AD");

        assertEquals(expected,actual);
    }
}
