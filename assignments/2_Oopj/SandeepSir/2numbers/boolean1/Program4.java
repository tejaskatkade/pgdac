package boolean1;

/***
 * Declare a method-local variable status of type boolean with the value true and
 * convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint: Use
 * Boolean.valueOf(boolean)).
 */

public class Program4 {
    public static void main(String[] args) {
        boolean status = true;
        Boolean statusVar = Boolean.valueOf(status);
        System.out.println(statusVar);                  // true
        
    }
}
