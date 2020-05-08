package calc;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void sumDoubletest() {
        double resultDouble = calculator.sum(5.6, 3.8);
        Assert.assertEquals(Math.floor(resultDouble), 9);
    }

    @Test
    public void sumLongtest() {
        long resultLong = calculator.sum(5, 5);
        Assert.assertEquals(resultLong, 10);
    }


    @Test
    public void subLongTest() {
        long resultLong = calculator.sub(10, 5);
        Assert.assertEquals(resultLong, 5);

    }

    @Test
    public void subDoubleTest() {
        double resultDouble = calculator.sub(10.5, 5);
        Assert.assertEquals(resultDouble, 5.5);
    }

    @Test
    public void multDoubleTest() {
        double resultDouble = calculator.mult(5.5, 6.8);
        Assert.assertEquals(resultDouble, 37);
    }

    @Test
    public void multLongTest() {
        long resultLong = calculator.mult(5, 5);
        Assert.assertEquals(resultLong, 25);
    }

    @Test
    public void divLongTest() {
        long resultLong = calculator.div(10, 2);
        Assert.assertEquals(resultLong, 5);

    }

    @Test
    public void divDoubleTest() {
        double resultDouble = calculator.div(10.8, 2);
        Assert.assertEquals(resultDouble, 5.4);
    }

    @Test
    public void powTest() {
        double resultDouble = calculator.pow(5, 2.2);
        Assert.assertEquals(resultDouble, 25);
    }

    @Test
    public void sqrtTest() {
        double resultDouble = calculator.sqrt(25);
        Assert.assertEquals(resultDouble, 5);
    }

    @Test
    public void tgTest() {
        double resultDouble = calculator.tg(90);
        Assert.assertEquals(resultDouble, 1);
    }

    @Test
    public void сtgTest() {
        double resultDouble = calculator.ctg(45);
        Assert.assertEquals(resultDouble, 1);
    }

    @Test
    public void сosTest() {
        double resultDouble = calculator.cos(90);
        Assert.assertEquals(Math.floor(resultDouble), 0);
    }

    @Test
    public void sinTest() {
        double resultDouble = calculator.sin(270);
        Assert.assertEquals(Math.floor(resultDouble), -1);
    }

    @Test
    public void isPositiveTest() {
        boolean result = calculator.isPositive(5);
        Assert.assertTrue(result);
    }

    @Test
    public void isNegativeTest() {
        boolean result = calculator.isNegative(-5);
        Assert.assertTrue(result);
    }

}
