package byte2;
/**
 * Declare a method-local variable strNumber of type String with some value and
 * convert it to a byte value using the parseByte method. (Hint: Use Byte
 * parseByte(String)).
 */
public class Program4 {
   public static void main(String[] args){
    String strNumber = "127";
    byte number = Byte.parseByte(strNumber);
    System.out.println(number);
   } 
}
