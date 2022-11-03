package company.a.b.c.kata.areaorperimeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaorPerimeterTest {

    @Test
    public void testSquare() {
        assertEquals(16, AreaorPerimeter.areaOrPerimeter(4, 4));
    }

    @Test
    public void testPerimeter() {
        assertEquals(32, AreaorPerimeter.areaOrPerimeter(6 , 10));
    }
}