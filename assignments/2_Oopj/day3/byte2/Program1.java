package byte2;

/***
 * Write a program to test how many bytes are used to represent a byte value using the
 * BYTES field. (Hint: Use Byte.BYTES).
 */
public class Program1 {
    public static void main(String[] args) {
        int size = Byte.BYTES;
        System.out.println("Bytes used to represent a byte value "+size);
    }
}
