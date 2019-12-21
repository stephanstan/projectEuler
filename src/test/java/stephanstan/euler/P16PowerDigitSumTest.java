package stephanstan.euler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class P16PowerDigitSumTest {

    private static Logger logger = LogManager.getLogger(PrimeNumberTest.class);

    @Disabled
    @Test
    void powerDigitSum() {
        logger.info("--------==-----" + Math.pow(2,15) );
       double product = Math.pow(2,15);

        logger.info("------stringed--==-----" + String.valueOf(product) );
        String[] digits2 = String.valueOf(product).split("(?<=.)");

        for (int i = 0; i < digits2.length-2; i++) {
            logger.info("------array--==-----" + digits2[i]);
        }

        int sum;
        sum = 0;
        for (int i = 0; i < digits2.length-2; i++) {
            sum = sum + Integer.valueOf(digits2[i]);
        }
        logger.info("------sum--==-----" + sum);
    }

    @Test
    void powerDigitSum02() {
        logger.info("--------==-----" + Math.pow(2,1000) );
        BigDecimal product = new BigDecimal(Math.pow(2,1000));

        logger.info("------stringed--==-----" + String.valueOf(product) );

        String[] digits2 = product.toString().split("(?<=.)");

        for (int i = 0; i < digits2.length; i++) {
            logger.info("------array--==-----" + digits2[i]);
        }
/*
         sum;
        sum = 0;
        for (int i = 0; i < digits2.length-2; i++) {
            sum = sum + Integer.valueOf(digits2[i]);
        }
        logger.info("------sum--==-----" + sum);
        */

    }
}
