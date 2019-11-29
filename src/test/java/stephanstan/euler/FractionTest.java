package stephanstan.euler;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class FractionTest {

    @Test
    void sortFractions(){
        Fraction frac;
        int i,j;
        int control=8;

        ArrayList<Fraction> ar = new ArrayList<Fraction>();

        for(j=control;j>1;j--){
            for(i=control-1;i>0;i--){
                if(i<j){
            //        frac=new Fraction(i,j);
                    ar.add(new Fraction(i,j));
//                    System.out.println(frac.getNumerator()+" / "+frac.getDenominator() + " - " + frac.getValue());
                }
            }
        }

        System.out.println("Unsorted");
        for (int k=0; k <ar.size(); k++)
            System.out.println(ar.get(k));
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
