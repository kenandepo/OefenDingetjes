package company.a.b.c.streams.ArrayPrinter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayPrinterTest {

    @Test
    public void testInteger() {
        Integer[] array=new Integer[]{2,4,5,2};
        assertEquals("2,4,5,2",ArrayPrinter.printArray(array));
    }
}
