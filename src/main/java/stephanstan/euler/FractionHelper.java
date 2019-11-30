package stephanstan.euler;

public class FractionHelper {

    public FractionHelper() {
    }

    /** @return the greatest common denominator */
    public static long gcm(long a, long b) {
        return b == 0 ? a : gcm(b, a % b); // Not bad for one line of code :)
    }

    /**
     * https://stackoverflow.com/questions/6618994/simplifying-fractions-in-java/6619098
     * @param numerator
     * @param denominator
     * @return
     */
    Fraction createReducedFraction(long numerator, long denominator) {
        long gcm = gcm(numerator, denominator);

        return new Fraction(numerator / gcm, denominator / gcm);
    }
}
