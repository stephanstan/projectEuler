package stephanstan.euler;

import java.util.Comparator;

class FractionComparator implements Comparator<Fraction>
{
    // Used for sorting in ascending order of
    // Fraction value
    public int compare(Fraction a, Fraction b) {
        if (a.getValue() < b.getValue()) return -1;
        if (a.getValue() > b.getValue()) return 1;
        return 0;
    }
}