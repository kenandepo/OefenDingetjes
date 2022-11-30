package company.a.b.c.kata2.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    public void test1() throws Exception {
        Hello h = new Hello();
        String[] name = { "John", "Smith" };
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!", h.sayHello(name, "Phoenix", "Arizona"));
    }
}