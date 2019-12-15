package stephanstan.euler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**

 */
public class Problem12TriangleNumberTest {
    private static Logger logger = LogManager.getLogger(Problem12TriangleNumberTest.class);

    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    @Disabled
    @Test
    void primeNumbers() {
        logger.info("--------==-----" + sieveOfEratosthenes(28));
    }

    @Test
    void triangleSequence(){
            long i, j;
            long sum = 0;

                for (i = 1; i <= 10000; i++) {
              //      System.out.print("i: " + i +" -> ");
                    for (j = 1; j <= i; j++) {
                        sum = sum + j;
//                        System.out.print(" " + j + " ");
                    }
//                    System.out.println(sum + "");
                    System.out.print("Factors of " + sum + " are: ");
                    for(long k = 1; k <= sum; ++k) {
                        if (sum % k == 0) {
                            System.out.print(k + " ");
                        }
                    }
                    System.out.println("");
                    sum =0;
                }
    }

    @Disabled
    @Test
    void primeNumberSum() {
//        logger.info("--------==-----" + sieveOfEratosthenes(2000000) );
///*
    long sum =0;

        for (Integer temp : sieveOfEratosthenes(2000000)) {
//            System.out.println(temp.longValue());
            sum = sum + temp.longValue();
        }
        logger.info("------============--==-----" + sum );
// */
    }





}
