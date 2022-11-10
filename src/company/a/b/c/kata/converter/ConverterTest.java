package company.a.b.c.kata.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    public void testHoopCount() {
        assertEquals(1, Converter.binToDecimal("1"));
        assertEquals(0, Converter.binToDecimal("0"));
        assertEquals(73, Converter.binToDecimal("1001001"));
    }
}