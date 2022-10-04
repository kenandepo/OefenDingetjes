package company.a.b.c.kata.howmuchiloveyou;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HowMuchILoveYouTest {

    @Test
    public void test1() {
        assertEquals("I love you", HowMuchILoveYou.howMuchILoveYou(1));
        assertEquals("a little", HowMuchILoveYou.howMuchILoveYou(2));
        assertEquals("not at all", HowMuchILoveYou.howMuchILoveYou(6));
    }

}