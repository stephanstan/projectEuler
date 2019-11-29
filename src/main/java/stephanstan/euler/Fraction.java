package stephanstan.euler;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

/**
 * https://www.geeksforgeeks.org/comparator-interface-java/
 */
public class Fraction {

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        this.setValue( ((double) numerator) / ((double) denominator) );
    }

    //  final static Log logger = LogFactory.getLog(Fraction.class);
    private int numerator;
    private int denominator;

    private double value;


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
