package company.a.b.c.streams.lettercount;

import static company.a.b.c.streams.lettercount.LetterCount.getTotalNumberOfLettersOfNamesLongerThanFive;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LetterCountTest {

    @Test
    public void test() {
        System.out.println("Testing if [william, jones, aaron, seppe, frank, gilliam] returns 14");
        assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam"), 14);

        System.out.println("Testing if [aaron] returns 0");
        assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("aaron"), 0);
    }
}
