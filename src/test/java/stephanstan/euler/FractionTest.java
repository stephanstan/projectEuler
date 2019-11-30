package stephanstan.euler;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;


public class FractionTest {

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
 //   @Disabled
    @Test
    void sortFractions(){
        Fraction frac;
        int i,j;
        int control=8;

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
        int i,j;
        int control=8;

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
        int i,j;

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
        int i;

        for ( i = 1; i < 8; i++) {
            frac = new Fraction(i,8);
            System.out.println(frac.getNumerator() +" / " + frac.getDenominator() + " - " + frac.getValue() );
        }
    }
}
