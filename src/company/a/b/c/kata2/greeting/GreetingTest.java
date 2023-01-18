package company.a.b.c.kata2.greeting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingTest {
    @Test
    public void basicTests() {
        assertEquals("Hello boss", Greeting.greet("Daniel", "Daniel"));
        assertEquals("Hello guest", Greeting.greet("Greg", "Daniel"));
    }
}
