import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before public void setUp() {
        calculator = new Calculator();
    }

    @Test public void testAddition() {
        Assert.assertTrue(9 == calculator.calculate(5, "+", 4));
    }

    @Test public void testMultiplication() {
        Assert.assertEquals(20, calculator.calculate(5, "*", 4));
    }
}
