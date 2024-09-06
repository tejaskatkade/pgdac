package boolean1;
/**
 * Program1 : Declare a method-local variable status of type boolean with the value true and convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).
 
 */

public class Program1 {


    public static void main(String[] args) {
        boolean status = true;
        String str = Boolean.toString(status);
        System.out.println(str);
    }
}