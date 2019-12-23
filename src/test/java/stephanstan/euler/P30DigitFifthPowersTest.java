package stephanstan.euler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class P30DigitFifthPowersTest {

    private static Logger logger = LogManager.getLogger(P30DigitFifthPowersTest.class);

    @Disabled
    @Test
    void fifthPower01() {
        double sum;
        sum = 0;

        for (int i = 1000; i < 10000; i++) {
     //       logger.info("------array--==-----" + i);
            String[] digits2 = String.valueOf(i).split("(?<=.)");

            for (int j = 0; j < digits2.length; j++) {
//                logger.info("------array--==-----" + digits2[j]);
//                logger.info("------int--==-----" + Integer.valueOf(digits2[j]));
            }

           sum =  Math.pow(Integer.valueOf(digits2[0]),4) + Math.pow(Integer.valueOf(digits2[1]),4) + Math.pow(Integer.valueOf(digits2[2]),4) + Math.pow(Integer.valueOf(digits2[3]),4);
if ( (double)i == sum )
            logger.info("--------==-----" + i +" sum= " +sum);

        }
    }

    @Test
    @Disabled
    void fifthPower02() {
        double sum;
        sum = 0;

        for (int i = 1000; i < 10000; i++) {
            //       logger.info("------array--==-----" + i);
            String[] digits2 = String.valueOf(i).split("(?<=.)");

            for (int j = 0; j < digits2.length; j++) {
//                logger.info("------array--==-----" + digits2[j]);
//                logger.info("------int--==-----" + Integer.valueOf(digits2[j]));
            }

            sum =  Math.pow(Integer.valueOf(digits2[0]),5) + Math.pow(Integer.valueOf(digits2[1]),5) + Math.pow(Integer.valueOf(digits2[2]),5) + Math.pow(Integer.valueOf(digits2[3]),5);
            if ( (double)i == sum )
                logger.info("--------==-----" + i +" sum= " +sum);

        }
    }

    @Test
    void fifthPower03() {
        double sum;
        sum = 0;
        logger.info("------ fifthPower03 ---start-");

        for (int i = 1000; i < 10000; i++) {
            //       logger.info("------array--==-----" + i);
            String[] digits2 = String.valueOf(i).split("(?<=.)");

            for (int j = 0; j < digits2.length; j++) {
//                logger.info("------array--==-----" + digits2[j]);
//                logger.info("------int--==-----" + Integer.valueOf(digits2[j]));
            }

            sum = Math.pow(Integer.valueOf(digits2[0]), 5) + Math.pow(Integer.valueOf(digits2[1]), 5) + Math.pow(Integer.valueOf(digits2[2]), 5) + Math.pow(Integer.valueOf(digits2[3]), 5);
            if ((double) i == sum)
                logger.info("--------==-----" + i + " sum= " + sum);
        }
        logger.info("------ fifthPower03 ---end-");
    }

        @Test
        void fifthPower04() {
            double sum;
            sum = 0;
            logger.info("------ fifthPower04 ---start-" );

            for (int i = 10000; i < 100000; i++) {
                //       logger.info("------array--==-----" + i);
                String[] digits2 = String.valueOf(i).split("(?<=.)");

                for (int j = 0; j < digits2.length; j++) {
//                logger.info("------array--==-----" + digits2[j]);
//                logger.info("------int--==-----" + Integer.valueOf(digits2[j]));
                }

                sum =  Math.pow(Integer.valueOf(digits2[0]),5) + Math.pow(Integer.valueOf(digits2[1]),5)
                        + Math.pow(Integer.valueOf(digits2[2]),5) + Math.pow(Integer.valueOf(digits2[3]),5)
                        + Math.pow(Integer.valueOf(digits2[4]),5);
                if ( (double)i == sum )
                    logger.info("--------==-----" + i +" sum= " +sum);
            }
            logger.info("------ fifthPower04 ---end-" );

        }

    @Test
    void fifthPower05() {
        double sum;
        sum = 0;
        logger.info("------ fifthPower05 ---start-" );

        for (int i = 100000; i < 1000000; i++) {
            //       logger.info("------array--==-----" + i);
            String[] digits2 = String.valueOf(i).split("(?<=.)");

            for (int j = 0; j < digits2.length; j++) {
//                logger.info("------array--==-----" + digits2[j]);
//                logger.info("------int--==-----" + Integer.valueOf(digits2[j]));
            }

            sum =  Math.pow(Integer.valueOf(digits2[0]),5) + Math.pow(Integer.valueOf(digits2[1]),5)
                    + Math.pow(Integer.valueOf(digits2[2]),5) + Math.pow(Integer.valueOf(digits2[3]),5)
                    + Math.pow(Integer.valueOf(digits2[4]),5)  + Math.pow(Integer.valueOf(digits2[5]),5);
            if ( (double)i == sum )
                logger.info("--------==-----" + i +" sum= " +sum);
        }
        logger.info("------ fifthPower05 ---end-" );

    }


}
