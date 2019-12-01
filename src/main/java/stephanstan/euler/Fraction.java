package stephanstan.euler;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * https://www.geeksforgeeks.org/comparator-interface-java/
 */
public class Fraction {

    private static Logger logger = LogManager.getLogger(Fraction.class);

    public Fraction( long numerator, long denominator)
    {
        logger.trace("Entering application.");
        logger.error("This is an test error log message");
        logger.info("---------------------------");
        logger.trace("Exit 1.");

        this.numerator = numerator;
        this.denominator = denominator;
        this.setValue( ((double) numerator) / ((double) denominator) );
    }

    //  final static Log logger = LogFactory.getLog(Fraction.class);
    private long numerator;
    private long denominator;

    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public String toString()
    {
        return this. numerator+ " / " + this.denominator
                + " - " + this.value;
    }
}
