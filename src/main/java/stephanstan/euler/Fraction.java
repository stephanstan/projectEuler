package stephanstan.euler;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

/**
 * https://www.geeksforgeeks.org/comparator-interface-java/
 */
public class Fraction {

    public Fraction( long numerator, long denominator)
    {
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
        return this. numerator+ " / " + this.denominator +
                " - " + this.value;
    }
}
