package jUnitTask.JUnitTests;

import jUnitTask.QEquation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

import static jUnitTask.QEquation.qEquation;
import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class JUnitParametersTests {
        private QEquation.Pair expected;
        private QEquation.Triple value;

        @Parameterized.Parameters
        public static Collection data() {
            return Arrays.asList( new Object[][]{
                    {new QEquation.Pair(-3.0, -4.0), new QEquation.Triple(1, 7, 12)},
                    {new QEquation.Pair(Double.NaN, Double.NaN), new QEquation.Triple(1, 7, 50) }
            });
        }

        public JUnitParametersTests(QEquation.Pair expected, QEquation.Triple value) {
            this.expected = expected;
            this.value = value;
        }

        @Test
        public void qEquationTests() {
            assertEquals(expected, qEquation(value.getFirst(), value.getSecond(), value.getThird()));
        }

        @Before
        public void loggingTest() {
            Logger.getLogger("logs").log(Level.INFO, "starting new test");
        }
}
