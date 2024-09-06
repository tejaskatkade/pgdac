package integerpkg;

/**
 * . Declare an integer variable with the value 7. Convert it to binary, octal, and
 * hexadecimal strings using methods from the Integer class. (Hint: Use Integer.toBinaryStrin
 * (int), Integer.toOctalString(int), and Integer.toHexString(int)).
 */
public class Program10 {
    public static void main(String[] args) {
        Integer a = 7;
        

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
        
    }
}
