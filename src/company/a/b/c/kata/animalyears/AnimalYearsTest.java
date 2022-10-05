package company.a.b.c.kata.animalyears;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AnimalYearsTest {

    @Test
    public void one() {
        assertArrayEquals(new int[]{1,15,15}, AnimalYears.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,24,24}, AnimalYears.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,56,64}, AnimalYears.humanYearsCatYearsDogYears(10));
    }

}