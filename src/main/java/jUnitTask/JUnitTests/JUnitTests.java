package jUnitTask.JUnitTests;

import static jUnitTask.QEquation.qEquation;
import static org.junit.Assert.*;

import jUnitTask.QEquation;
import org.junit.Test;

public class JUnitTests {
    @Test
    public void happyPathTest() {
        assertEquals(new QEquation.Pair(-3.0, -4.0), qEquation(1, 7, 12));
    }

    @Test
    public void unHappyPathTest() {
        assertNotEquals(new QEquation.Pair(12, 99), qEquation(1, 7, 12));

    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZero() {
        qEquation(0, 1, 0);
    }

    @Test
    public void negativeSqrt() {
        assertEquals(new QEquation.Pair(Double.NaN, Double.NaN), qEquation(1, 7, 50));
    }

}
