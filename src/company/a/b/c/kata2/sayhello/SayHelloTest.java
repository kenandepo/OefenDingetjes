package company.a.b.c.kata2.sayhello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SayHelloTest {

    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                SayHello.sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                SayHello.sayHello("Captain Kirk"));
    }
    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                SayHello.sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                SayHello.sayHello("Dr. McCoy"));
    }
}