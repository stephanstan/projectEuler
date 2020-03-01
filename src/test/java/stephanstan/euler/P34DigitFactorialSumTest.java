package stephanstan.euler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class P34DigitFactorialSumTest {

    private static Logger logger = LogManager.getLogger(P34DigitFactorialSumTest.class);

    private static BigDecimal calculateFactorial (int number) {
        BigDecimal factorial = BigDecimal.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(new BigDecimal(i));
        }
        return factorial;
    }

  //  @Disabled
    @Test
    void factorialTest() {
        logger.info("---------- " + calculateFactorial(5));

    }

    @Disabled
    @Test
    void factorialTest_01() {
        logger.info("---------- " + calculateFactorial(8));

    }

//   @Disabled
    @Test
    void factorialTest_02() {
   //     logger.info("---------- " + calculateFactorial(100));

        BigDecimal sum;

        for (int i = 1000000; i < 10000000; i++) {
//            logger.info("---------- " + calculateFactorial(100));
            String[] digits2 = String.valueOf(i).split("(?<=.)");
            sum =        calculateFactorial(Integer.valueOf(digits2[0]))
                    .add(calculateFactorial(Integer.valueOf(digits2[1])))
                    .add(calculateFactorial(Integer.valueOf(digits2[2])))
                    .add(calculateFactorial(Integer.valueOf(digits2[3])))
                    .add(calculateFactorial(Integer.valueOf(digits2[4])))
                    .add(calculateFactorial(Integer.valueOf(digits2[5])))
                    .add(calculateFactorial(Integer.valueOf(digits2[6])));

           if(new BigDecimal(i).equals(sum )) {
                logger.info("---------- " + i + " +++++ " + sum);
           }
        }
    }


}
