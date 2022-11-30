package company.a.b.c.kata2.hello;

public class Hello {

    public String sayHello(String[] name, String city, String state) {
        String totalName = "";
        for (int i = 0; i < name.length; i++) {
            totalName=totalName+" "+name[i];
        }
        final String substring = totalName.substring(1);
        return "Hello, " + substring + "! Welcome to " + city + ", " + state + "!";
    }
}

//other solution
//    return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
