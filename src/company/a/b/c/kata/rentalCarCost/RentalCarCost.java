package company.a.b.c.kata.rentalCarCost;

//After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
//
//You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.
//
//Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
//
//Write a code that gives out the total amount for different days(d).
public class RentalCarCost {

    public static int rentalCarCost(int d) {

        int subtotal = d * 40;
        if (d >= 7) {
            subtotal = subtotal - 50;
        }
        if (d >= 3 && d < 7) {
            subtotal = subtotal - 20;
        }
        return subtotal;
    }
}
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class RentalCarExampleTests {
//  @Test
//  public void under3Tests() {
//    assertEquals(40, Kata.rentalCarCost(1));
//    assertEquals(80, Kata.rentalCarCost(2));
//  }
//
//  @Test
//  public void under7Tests() {
//    assertEquals(100, Kata.rentalCarCost(3));
//    assertEquals(140, Kata.rentalCarCost(4));
//    assertEquals(180, Kata.rentalCarCost(5));
//    assertEquals(220, Kata.rentalCarCost(6));
//  }
//
//  @Test
//  public void over7Tests() {
//    assertEquals(230, Kata.rentalCarCost(7));
//    assertEquals(270, Kata.rentalCarCost(8));
//    assertEquals(310, Kata.rentalCarCost(9));
//    assertEquals(350, Kata.rentalCarCost(10));
//  }
//}