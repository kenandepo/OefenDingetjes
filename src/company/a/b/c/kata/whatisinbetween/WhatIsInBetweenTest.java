package company.a.b.c.kata.whatisinbetween;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhatIsInBetweenTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, WhatIsInBetween.between(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, WhatIsInBetween.between(-2, 2));
    }
}