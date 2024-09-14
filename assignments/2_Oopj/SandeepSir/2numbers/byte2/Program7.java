package byte2;
/***
 * Declare a method-local variable strNumber of type String with some byte value
 * and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint:
 * Use Byte.valueOf(String)).
 */

public class Program7 {
    public static void main(String[] args) {
        String strNum = "121";
        Byte number = Byte.valueOf(strNum);
        System.out.println(number);    
    }
}
