package stephanstan.euler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LongestCollatzSequence {

    private static Logger logger = LogManager.getLogger(LongestCollatzSequence.class);

    public static Boolean isEven(long i) {
        return (i % 2) == 0;
    }

    public static long evenDeal(long target ){
        return target /2;
    }

    public static long oddDeal(long target ){
        return (3 * target) +1;
    }

    void collatzSequence(long starter) {
        while( starter >  1) {
            System.out.print(" " + starter + " ->");
            if( isEven(starter)) {
                starter = evenDeal(starter);
//                System.out.print(" " + starter + " ->");
            }
            else{
                starter = oddDeal(starter);
            }
        }
        System.out.println( " " + starter );
    }

    protected long collatzSequenceCount(long starter) {
        long count = 0;
        while( starter >  1) {
 //           System.out.print(" " + starter + " ->");
            if( isEven(starter)) {
                count++;
                starter = evenDeal(starter);
            }
            else{
                starter = oddDeal(starter);
                count++;
            }
        }
//      System.out.println( " " + starter );
        return count + 1;
    }

    @Disabled
    @Test
    void testIsEven() {
        logger.info("--------=================== " + isEven(4));
        logger.info("--------=================== " + evenDeal(4));
    }

    @Disabled
    @Test
    void test01(){
        logger.info("--------=================== " + evenDeal(100));
    }

    @Disabled
    @Test
    void test02(){
        logger.info("--------=================== " + oddDeal(13));
    }

    @Disabled
    @Test
    void test03(){

        long starter = 10001 ;

        while( starter >  1) {
            System.out.print(" " + starter + " ->");
            if( isEven(starter)) {
                starter = evenDeal(starter);
//                System.out.print(" " + starter + " ->");
            }
            else{
                starter = oddDeal(starter);
            }
        }
//                System.out.println( " " + starter );
  //      logger.info("--------=================== " + oddDeal(13));
    }

    @Disabled
    @Test
    void test04(){

        for (long i = 1; i < 100; i++) {
            System.out.println( i + " -> " + collatzSequenceCount(i) );
        }
    }

    @Test
    void test05(){

        for (long i = 1; i < 1000000; i++) {
            if (collatzSequenceCount(i) > 500)
                System.out.println( i + " -> " + collatzSequenceCount(i) );
        }
    }

}