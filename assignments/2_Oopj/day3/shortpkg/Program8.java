package shortpkg;

/**
 * Experiment with converting a short value into other
 * primitive types or vice versa and observe the results.
 */

public class Program8 {
    public static void main(String[] args) {
       
        // short to int
       
        short num = 1234;
        int i = num;
        System.out.println(i);

        // int to short

        // short num1 = i; // Type mismatch: cannot convert from int to short

        short num1 = (short) i;
        System.out.println(num1);


        // Short to short
        //  Wrapper to primitive

        Short val =  1234;
        short pVal = val.shortValue();

        System.out.println(pVal);


    }    
}
