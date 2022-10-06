package company.a.b.c.kata.feastbeast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FeastBeastTest {

    // TODO: Replace examples and use TDD development by writing your own tests
    @Test
    public void fixedTest() {
        assertTrue(FeastBeast.feast("great blue heron", "garlic nann"));
        assertTrue(FeastBeast.feast("chickadee", "chocolate cake"));
        assertFalse(FeastBeast.feast("brown bear", "bear claw"));
        assertFalse(FeastBeast.feast("monkey", "monej"));
    }
}


