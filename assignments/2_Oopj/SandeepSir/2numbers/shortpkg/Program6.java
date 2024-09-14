package shortpkg;
/***
 *Declare a method-local variable number of type short
 with some value and convert it to the corresponding
 wrapper class using Short.valueOf(). (Hint: Use Short
 valueOf(short)).
 */

public class Program6 {
    public static void main(String[] args) {
        short number = 4562;
        Short num = Short.valueOf(number);
        System.out.println(num);
    }
    
}
