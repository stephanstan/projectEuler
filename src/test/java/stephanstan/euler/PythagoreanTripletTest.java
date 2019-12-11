package stephanstan.euler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class PythagoreanTripletTest {

    private static Logger logger = LogManager.getLogger(PythagoreanTripletTest.class);
    //    @Disabled
    @Test
    void findTriplet() {

        double diff =0;
        for ( int j = 1; j <= 999; j++) {
            for (int i = 0; i <= 999; i++) {
//                logger.info(i + " - " + (i + 1) + " - " + (1000 - (2 * i + 1)) + "- " + ((Math.pow(i, 2) + Math.pow((i + 1), 2)) - (Math.pow((1000 - (2 * i + 1)), 2))));
                  diff = ((Math.pow(i, 2) + Math.pow((i + j), 2)) - (Math.pow((1000 - (2 * i + j)), 2)));
                if  ( (diff > -2) && (diff < 2) ) {
                    logger.info("a = " + i + ", b = " + (i + j) + ", c = " + (1000 - (2 * i + j)) + " diff: " + ((Math.pow(i, 2) + Math.pow((i + j), 2)) - (Math.pow((1000 - (2 * i + j)), 2))));
                }
                }
        }
    }

}
