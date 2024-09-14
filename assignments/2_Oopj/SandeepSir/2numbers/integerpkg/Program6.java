package integerpkg;


/***
 * Declare a method-local variable number of type int with
 * some value and convert it to the corresponding wrapper
 * class using Integer.valueOf(). (Hint: Use Integer.valueO
 * (int)).
 */
public class Program6 {
    public static void main(String[] args) {
        int number = 1234567;
        Integer num = Integer.valueOf(number);
        System.out.println(num);
    }
}
