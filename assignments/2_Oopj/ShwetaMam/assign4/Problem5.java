/***
 * Write a Program that demonstrates widening conversion from int to (double
 * float, boolean, string)  and prints the result
 */

public class Problem5 {
   
    public static void main(String[] args) {
        int num = 10;

        double d = num;
        System.out.println(d);

        float f = num;
        System.out.println(f);

        //boolean b = num; 
        //  Type mismatch: cannot convert from int  to boolean
        
        // boolean b = (boolean)num;
        // Cannot cast from int to boolean


        //String str1 = num;
        // Type mismatch: cannot convert from int to String

        String str1 = String.valueOf(num);
        String str2 = Integer.toString(num);

        System.out.println(str1);
        System.out.println(str2);

    }
}
