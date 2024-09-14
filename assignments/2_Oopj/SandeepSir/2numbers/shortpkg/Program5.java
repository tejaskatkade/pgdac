package shortpkg;

/**
 * Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and
 * attempt to convert it to a short value. (Hint: parseShort method will throw a
 * NumberFormatException).
 */
public class Program5 {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";
        System.out.println(strNumber);
        //short number = Short.parseShort(strNumber);
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"

    }
}
