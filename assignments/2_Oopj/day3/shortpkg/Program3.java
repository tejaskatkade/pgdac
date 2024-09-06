package shortpkg;

/**
 * Declare a method-local variable number of type short with some value and convert it to a\
 * String using the toString method. (Hint: Use Short.toString(short)).
 */
public class Program3 {
    public static void main(String[] args) {
        short number = 345;
        String strNumber = Short.toString(number);
        System.out.println(strNumber);                  // 345
    }
}
