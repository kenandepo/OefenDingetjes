package company.a.b.c.kata.tenminutewalk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TenMinWalkTest {

    @Test
    public void test1() {
        assertEquals(true, TenMinWalk.isValid(new char[] { 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
    }

    @Test
    public void even_steps() {
        assertEquals(false, TenMinWalk.isValid(new char[] { 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e' }));
    }

    @Test
    public void one_step() {
        assertEquals(false, TenMinWalk.isValid(new char[] { 'w' }));
    }

    @Test
    public void test4() {
        assertEquals(false, TenMinWalk.isValid(new char[] { 'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
    }
}

