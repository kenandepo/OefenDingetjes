package company.a.b.c.kata2.greeting;

public class Greeting {
    static String greet(String name, String owner) {

        return name.equals(owner) ? "Hello boss" : "Hello guest";

    }
}
