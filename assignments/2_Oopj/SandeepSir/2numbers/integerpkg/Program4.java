package integerpkg;


/***
 * Declare a method-local variable strNumber of type String
 * with some value and convert it to an int value using the
 * parseInt method. (Hint: Use Integer.parseInt(String)).
 */
public class Program4 {
    public static void main(String[] args) {
        String strNum = "1234567";
        int num = Integer.parseInt(strNum);
        System.out.println(num);
    }
}
