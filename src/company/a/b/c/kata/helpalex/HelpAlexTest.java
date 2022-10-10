package company.a.b.c.kata.helpalex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelpAlexTest {

    @Test
    public void testHoopCount(){
        assertEquals("Great, now move on to tricks", HelpAlex.hoopCount(11));
        assertEquals("Keep at it until you get it", HelpAlex.hoopCount(7));
    }

}