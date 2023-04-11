package company.a.b.c.kata3.GiftSorter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GiftSorterTest {

    @Test
    public void Tests1() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals( "abcdef", gs.sortGiftCode("fedcba"));
    }

    @Test
    public void Tests2() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("abcdefghijklmnopqrstuvwxyz", gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }

}
