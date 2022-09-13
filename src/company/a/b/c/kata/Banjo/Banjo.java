package company.a.b.c.kata.Banjo;

//Create a function which answers the question "Are you playing banjo?".
//If your name starts with the letter "R" or lower case "r", you are playing banjo!
//
//The function takes a name as its only argument, and returns one of the following strings:
//
//name + " plays banjo"
//name + " does not play banjo"
//Names given are always valid strings.
public class Banjo {

    public static String areYouPlayingBanjo(String name) {

        String plays = " plays banjo";
        String doesnt = " does not play banjo";

        final String c = String.valueOf(name.charAt(0));
        if (c.equals("r") || c.equals("R")) {
            return name + plays;
        } else {
            return name + doesnt;
        }

    }

}

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class BanjoExampleTest {
//  @Test
//  public void PeopleThatPlayBanjo() {
//    assertEquals( "Nope!", "Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
//    assertEquals( "Nope!", "Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
//    assertEquals( "Nope! Remember lower case counts, too!", "rolf plays banjo", Banjo.areYouPlayingBanjo("rolf"));
//    assertEquals( "Nope!", "bravo does not play banjo", Banjo.areYouPlayingBanjo("bravo"));
//  }
//}