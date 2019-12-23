package stephanstan.euler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class P20FactorialDigitSumTest {

    private static Logger logger = LogManager.getLogger(P20FactorialDigitSumTest.class);

    private static BigDecimal calculateFactorial (int number) {
        BigDecimal factorial = BigDecimal.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(new BigDecimal(i));
        }
        return factorial;
    }

    @Disabled
    @Test
    void factorialTest() {
        logger.info("---------- " + calculateFactorial(10));

    }

//    @Disabled
    @Test
    void factorialTest_01() {
        logger.info("---------- " + calculateFactorial(100));

    }

}
