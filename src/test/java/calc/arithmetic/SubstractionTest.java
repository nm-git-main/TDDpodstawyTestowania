package calc.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstractionTest {

    @Test
    void multiNumber() {
        double base = 10000;
        double[] costs = {100, 300, 400, 2000};
        double expected = 7200;

        double actual = Substraction.multiNumber(base, costs);
        assertEquals(expected, actual);

    }
}