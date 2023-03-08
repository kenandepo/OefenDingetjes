package company.a.b.c.streams.filter;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class FilterTest {

    @Test
    public void test() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");

        final List<String> result = Filter.filtermBoy(collection);

        assertEquals(expected, result);
    }
}
