package collazo.albert.CalcProjectTest;

import collazo.albert.CalcProject.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by albertcollazo on 1/16/17.
 */
public class CalcProjectTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void addNumbersTest(){
        Double expected = 4.0;
        Double actual = calculator.addNumbers();
        Assert.assertEquals(actual,expected);
    }
}
