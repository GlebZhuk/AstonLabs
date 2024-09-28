import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFirst {
    private MathFunc math;

    @BeforeEach
    public void init() {
        math = new MathFunc();
    }

    @AfterEach
    public void tearDown() {
        math = null;
    }

    @Test
    public void factorial() {
        assertEquals(math.getFactorial(0), 1);
        assertEquals(math.getFactorial(1), 1);
        assertEquals(math.getFactorial(5), 120);
    }

    @Test
    public void factorialNegative() {
        math.getFactorial(-1);
    }
}
