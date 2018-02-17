package guru.springframework.lab1.quickstart;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {

        Calculator.setIntegerMode();
        int expectedValue = 3;
        int actualValue = Calculator.add (1, 2);
        assertEquals (expectedValue, actualValue);

        Calculator.setDoubleMode();
        double expectedValue1=3.1;
        double actualValue1=Calculator.add(1.1,2.0);
        assertEquals(expectedValue1, actualValue1);
    }


    @Test
    public void testSub() throws Exception {

        Calculator.setIntegerMode();
        int expectedValue=-1;
        int actualValue=Calculator.sub(1, 2);
        assertEquals(expectedValue, actualValue);

        Calculator.setDoubleMode();
        double expectedValue1=1.0;
        double actualValue1=Calculator.sub(1.1,0.1);
        assertEquals(expectedValue1, actualValue1);
    }


    @Test
    public void testDiv() throws Exception {

        Calculator.setIntegerMode();
        int expectedValue=0;
        int actualValue=Calculator.div(1, 2);
        assertEquals(expectedValue, actualValue);

        Calculator.setDoubleMode();
        double expectedValue1=2.0;
        double actualValue1=Calculator.div(2.0,1.0);
        assertEquals(expectedValue1, actualValue1);
    }


    @Test
    public void testMult() throws Exception {

        Calculator.setIntegerMode();
        int expectedValue=2;
        int actualValue=Calculator.mult(1, 2);
        assertEquals(expectedValue, actualValue);

        Calculator.setDoubleMode();
        double expectedValue1=2.0;
        double actualValue1=Calculator.mult(1.0,2.0);
        assertEquals(expectedValue1, actualValue1);
    }


    @Test(expected=Exception.class)
    public void testDivBy0() throws Exception{

        Calculator.setIntegerMode();
        Calculator.div(1,0);
    }

    @Test(expected=Exception.class)
    public void testBounds() throws Exception{

        Calculator.setIntegerMode();
        Calculator.add(Integer.MAX_VALUE,1);
        Calculator.sub(Integer.MIN_VALUE,1);

        Calculator.setDoubleMode();
        Calculator.add(Double.MAX_VALUE,1);
        Calculator.sub(Integer.MIN_VALUE, 1);
    }

    @Test(expected=Exception.class)
    public void testModes() throws Exception{

        Calculator.setIntegerMode();
        Calculator.add(2.1, 3.2);

        Calculator.setDoubleMode();
        Calculator.div(1,0);
    }

}