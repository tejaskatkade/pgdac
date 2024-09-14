package byte2;

/* Declare a method-local variable number of type byte with some value and
 * convert it to a String using the toString method. (Hint: Use Byte.toStrin
 * (byte)). */
public class Program3 {
    public static void main(String[] args) {
        byte number = 100;
        String strNum = Byte.toString(number);
        System.out.println(strNum);
   
    } 
}
