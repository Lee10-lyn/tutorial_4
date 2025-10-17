package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void testAddition() {
        Calc c = new Calc();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calc c = new Calc();
        assertEquals(2, c.subtract(4, 2));
    }
}