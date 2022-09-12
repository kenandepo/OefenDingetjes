package company.a.b.c.kata.keepydrated;
//Nathan loves cycling.
//
//Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
//
//You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
//
//For example:
//
//time = 3 ----> litres = 1
//
//time = 6.7---> litres = 3
//
//time = 11.8--> litres = 5
public class KeepHydrated {
    public int Liters(double time)  {

        return  (int) (time * 0.5);

    }

}



//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest {
//
//    KeepHydrated kh = new KeepHydrated();
//
//    @Test
//    public void SampleTest1() {
//
//      assertEquals(1, kh.Liters(2));
//
//    }
//    @Test
//    public void SampleTest2()  {
//
//      assertEquals(0, kh.Liters(0.97));
//
//    }
//    @Test
//    public void SampleTest3()  {
//
//      assertEquals(7, kh.Liters(14.64));
//
//    }
//    @Test
//    public void SampleTest4()  {
//
//      assertEquals(800, kh.Liters(1600.20));
//
//    }
//    @Test
//    public void SampleTest5()  {
//
//      assertEquals(40, kh.Liters(80));
//
//    }
//}