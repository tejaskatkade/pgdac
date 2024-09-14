package shortpkg;
/**
 * . Write a program to test how many bytes are used to
 * represent a short value using the BYTES field. (Hint:
 * Use Short.BYTES).
 */
public class Program1 {
   

    public static void main(String[] args) {
        int bytesValue  = Short.BYTES;
        int size = Short.SIZE;

        System.out.println(bytesValue);     // 2
        System.out.println(size);           // 16


    }     

}
