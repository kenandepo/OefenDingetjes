package company.a.b.c.kata3.arithmetic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArithmeticTest {

        @Test
        public void testBasic() {
            assertEquals(3, Arithmetic.arithmetic(1, 2, "add"));
            assertEquals(6, Arithmetic.arithmetic(8, 2, "subtract"));
            assertEquals(10, Arithmetic.arithmetic(5, 2, "multiply"));
            assertEquals(4, Arithmetic.arithmetic(8, 2, "divide"));
        }
    }

