package boolean1;
/***
 * . Declare a method-local variable strStatus of type String with the value "true" and convert it to a boolean using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String)).
 */


public class Program2 {
    public static void main(String[] args) {
        // String strStatus = "true";
        // Boolean status = Boolean.parseBoolean(strStatus);
        // System.out.println(status);     // true
        
        String strStatus = "True";
        Boolean status = Boolean.parseBoolean(strStatus);
        System.out.println(status);     // true


        String val = "cdac";
        Boolean bVal = Boolean.parseBoolean(val);
        System.out.println(bVal);       // false
    }
    
}
