package stephanstan.euler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * <p>
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 * *
 * NOTE: Do not count spaces or hyphens.
 * For example, 342 (three hundred and forty-two)
 * contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 */

public class P17NumberLetterCountsTest {

    private static Logger logger = LogManager.getLogger(P17NumberLetterCountsTest.class);

    ArrayList<String> ar = new ArrayList<String>();
    ArrayList<String> decList = new ArrayList<String>();
    ArrayList<String> centList = new ArrayList<String>();

    //    @Disabled
    @Test
    void wordcount() {

        populate1_19();

        populateDecList();
        populateCentList();

        for (int i = 0; i < 8; i++) {
            decCountTo(decList.get(i));
        }

        ar.add(centList.get(0));

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 19; i++) {
                ar.add(centList.get(j) + "and" + ar.get(i));
            }
            for (int k = 0; k < 8; k++) {
                decCountTo(centList.get(j) + "and" + decList.get(k));
            }
            if (j < 8)
            ar.add(centList.get(j+1));
        }
        ar.add("OneThousand");


        logger.info("---------- " + ar.size());

        int count = 0;

        for (int i = 0; i < ar.size(); i++) {
//            logger.info("---------- " + ar.get(i).length());
            logger.info("---------- " + ar.get(i));
            count = count + ar.get(i).length();
        }
        logger.info("---------- " + count);
    }

    void decCountTo(String dec) {
        ar.add(dec);
        for (int i = 0; i < 9; i++) {
            ar.add(dec + ar.get(i));
        }
    }

    private void populateCentList() {
        centList.add("OneHundred");
        centList.add("TwoHundred");
        centList.add("ThreeHundred");
        centList.add("FourHundred");
        centList.add("FiveHundred");
        centList.add("SixHundred");
        centList.add("SevenHundred");
        centList.add("EightHundred");
        centList.add("NineHundred");
    }

    private void populateDecList() {
        decList.add("Twenty");
        decList.add("Thirty");
        decList.add("Forty");
        decList.add("Fifty");
        decList.add("Sixty");
        decList.add("Seventy");
        decList.add("Eighty");
        decList.add("Ninety");
    }

    private void populate1_19() {
        ar.add("One");
        ar.add("Two");
        ar.add("Three");
        ar.add("Four");
        ar.add("Five");
        ar.add("Six");
        ar.add("Seven");
        ar.add("Eight");
        ar.add("Nine");
        ar.add("Ten");
        ar.add("Eleven");
        ar.add("Twelve");
        ar.add("Thirteen");
        ar.add("Fourteen");
        ar.add("Fifteen");
        ar.add("Sixteen");
        ar.add("Seventeen");
        ar.add("Eighteen");
        ar.add("Nineteen");
    }

}

