package stephanstan.euler;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;


/**
 * Consider the fraction, n/d, where n and d are positive integers. If n<d and HCF(n,d)=1, it is called a reduced proper fraction.
  * If we list the set of reduced proper fractions for d ≤ 8 in ascending order of size, we get:
  * 1/8, 1/7, 1/6, 1/5, 1/4, 2/7, 1/3, 3/8, 2/5, 3/7, 1/2, 4/7, 3/5, 5/8, 2/3, 5/7, 3/4, 4/5, 5/6, 6/7, 7/8
  * It can be seen that 2/5 is the fraction immediately to the left of 3/7.
  * By listing the set of reduced proper fractions for d ≤ 1,000,000 in ascending order of size, find the numerator of the fraction immediately to the left of 3/7.
 *
 * 42845 / 99972 - 0.42856999959988795
 * 42848 / 99979 - 0.428569999699937
 * 42851 / 99986 - 0.428569999799972
 * 42854 / 99993 - 0.428569999899993
 * 42857 / 100000 - 0.42857
 * 3 / 7 - 0.42857142857142855
 * 42856 / 99997 - 0.4285728571857156
 * 42853 / 99990 - 0.4285728572857286
 * 42850 / 99983 - 0.42857285738575557
 */
public class FractionTest {

    @Test
    void createHCFFractions(){
        Fraction frac;
        long i,j;
        long control=100000;

        ArrayList<Fraction> ar = new ArrayList<Fraction>();
        FractionHelper helper = new FractionHelper();

        for(j=control;j>1;j--){
            for(i=control-1;i>0;i--){
                if(i<j){
                    frac = helper.createReducedFraction(i,j);
                  if (frac.getValue() > (double) 0.42855712426154 && frac.getValue() < (double)0.4285761306036469 )
                    ar.add(frac);
    //                    System.out.println(frac.getNumerator()+" / "+frac.getDenominator() + " - " + frac.getValue());
                }
            }
        }

        Collections.sort(ar, new FractionComparator());

        //        System.out.println("Unsorted");
        //        for (int k=0; k <ar.size(); k++)
        //           System.out.println(ar.get(k));
        Set set = new TreeSet<Fraction>(new FractionComparator() );
        set.addAll(ar);


     ArrayList<Fraction> ar2  = new ArrayList(set);

    System.out.println("\nSorted by value");
    for (int m=0; m<ar2.size(); m++)
//            if (ar2.get(m).getValue() > (double)0.42857142857142850 && ar.get(m).getValue() < (double)0.43)
    {
        System.out.println(ar2.get(m));
//        System.out.print(ar2.get(m) + ", ");
    }
}

    /** @return the greatest common denominator */
    public static long gcm(long a, long b) {
        return b == 0 ? a : gcm(b, a % b); // Not bad for one line of code :)
    }

    public static String asFraction(long a, long b) {
        long gcm = gcm(a, b);
        return (a / gcm) + "/" + (b / gcm);
    }

    @Disabled
    @Test
    void testGCM()
    {
        System.out.println(gcm(5,10));
    }

    @Disabled
    @Test
    void testasFraction()
    {
        System.out.println(asFraction(5,10));
    }


    /**
     * best method so far
     */
   @Disabled
    @Test
    void sortFractions(){
        Fraction frac;
        long i,j;
        long control=8;

        ArrayList<Fraction> ar = new ArrayList<Fraction>();

        for(j=control;j>1;j--){
            for(i=control-1;i>0;i--){
                if(i<j){
                    frac=new Fraction(i,j);
  //                  if (frac.getValue() > (double)0.42857142857142850 && frac.getValue() < (double)0.43 )
                    ar.add(frac);
//                    System.out.println(frac.getNumerator()+" / "+frac.getDenominator() + " - " + frac.getValue());
                }
            }
        }

//        System.out.println("Unsorted");
  //      for (int k=0; k <ar.size(); k++)
    //        System.out.println(ar.get(k));

        Collections.sort(ar, new FractionComparator());

        System.out.println("\nSorted by value");
        for (int m=0; m<ar.size(); m++)
//            if (ar.get(m).getValue() > (double)0.42857142857142850 && ar.get(m).getValue() < (double)0.43)
            System.out.println(ar.get(m));
    }


    @Disabled
    @Test
    void howManyFractionsWouldYouLike(){
        Fraction frac;
        long i,j;
        long control=8;

        for(j=control;j>1;j--){
            for(i=control-1;i>0;i--){
                if(i<j){
                    frac=new Fraction(i,j);
                    System.out.println(frac.getNumerator()+" / "+frac.getDenominator() + " - " + frac.getValue());
                }
            }
        }
    }


    @Disabled
    @Test
    void basicObjectDesc() {
        Fraction frac;
        long i,j;

        for (j = 8; j > 1; j--) {
            for (i = 7; i > 0; i--) {
                if (i < j) {
                    frac = new Fraction(i, j);
                    System.out.println(frac.getNumerator() + " / " + frac.getDenominator());
                }
            }
        }
    }

    @Disabled
    @Test
    void basicObjectAsc() {
        Fraction frac;
        long i;

        for ( i = 1; i < 8; i++) {
            frac = new Fraction(i,8);
            System.out.println(frac.getNumerator() +" / " + frac.getDenominator() + " - " + frac.getValue() );
        }
    }
}
