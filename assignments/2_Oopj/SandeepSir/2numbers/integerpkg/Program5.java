package integerpkg;

/***
 * Declare a method-local variable strNumber of type Strin
 * with the value "Ab12Cd3" and attempt to convert it to an
 * int value. (Hint: parseInt method will throw a
 * NumberFormatException).
 */
public class Program5 {
    public static void main(String[] args) {
        String strNum = "1Aa4b67";
        //int num = Integer.parseInt(strNum);
        // Exception in thread "main" java.lang.NumberFormatException

        System.out.println(strNum);
    }
}
