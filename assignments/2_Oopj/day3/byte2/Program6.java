package byte2;
/***
 * . Declare a method-local variable number of type byte with some value and
 * convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use
 * Byte.valueOf(byte)).
 */

public class Program6 {
    public static void main(String[] args) {
        byte number = 111;
        Byte num = Byte.valueOf(number);
        System.out.println(num);  
    }
}
