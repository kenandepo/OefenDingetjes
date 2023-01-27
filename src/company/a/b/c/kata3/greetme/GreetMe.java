package company.a.b.c.kata3.greetme;

public class GreetMe {
    public static String greet(String name) {
        return "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1) + "!";
    }
}
