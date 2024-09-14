package boolean1;

/***
 * Declare a method-local variable strStatus of type String with the value "1" or "0"
 * and attempt to convert it to a boolean. (Hint: parseBoolean method will not work as
 * expected with "1" or "0").
 */

public class Program3 {
    public static void main(String[] args) {
        // String strStatus = "1";
        // Boolean status = Boolean.parseBoolean(strStatus);
        // System.out.println(status);         // false
        
        String strStatus = "0";
        Boolean status = Boolean.parseBoolean(strStatus);
        System.out.println(status);         // false
    }
}
