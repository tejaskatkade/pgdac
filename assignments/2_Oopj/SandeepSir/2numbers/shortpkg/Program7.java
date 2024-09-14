package shortpkg;

/**
 * Declare a method-local variable strNumber of type
 * String with some short value and convert it to the
 * corresponding wrapper class using Short.valueOf(). 
 * (Hint: Use Short.valueOf(String)).
 */
public class Program7 {
    public static void main(String[] args) {
        String strNumber = "1234";
        Short number = Short.valueOf(strNumber);
        System.out.println(number);
    }
}
