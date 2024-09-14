package byte2;

/***
 * Declare a method-local variable strNumber of type String with the value
 * "Ab12Cd3" and attempt to convert it to a byte value. (Hint: parseByte method
 * will throw a NumberFormatException).
 */

public class Program5 {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";
        Byte num = Byte.parseByte(strNumber);
        System.out.println(num);

        // Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"
        // at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        // at java.base/java.lang.Integer.parseInt(Integer.java:661)
        // at java.base/java.lang.Byte.parseByte(Byte.java:193)
        // at java.base/java.lang.Byte.parseByte(Byte.java:219)
        // at Program5.main(Program5.java:10)
    }
}
