package company.a.b.c.kata3.greetme;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetMeTest {

    @Test
    public void basicTests() {
        assertEquals("Hello Riley!", GreetMe.greet("riley"));
    }
}
