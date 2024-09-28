import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFirst {
    private MathFunc math;

    @BeforeMethod
    public void init() {
        math = new MathFunc();
    }

    @AfterMethod
    public void tearDown() {
        math = null;
    }

    @Test
    public void factorial() {
        Assert.assertEquals(math.getFactorial(0), 1);
        Assert.assertEquals(math.getFactorial(1), 1);
        Assert.assertEquals(math.getFactorial(5), 120);
    }

    @Test
    public void factorialNegative() {
        math.getFactorial(-1);
    }
}
