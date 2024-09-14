package integerpkg;
/**
 * Declare two integer variables with values 10 and 20, and find the minimum and maximum
 * values using the Integer class. (Hint: Use Integer.min(int, int) and Integer.max(int,
 * int)).z
 */
public class Program9 {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        System.out.println(Integer.max(a, b));
        System.out.println(Integer.min(a, b));
        
    }
}
