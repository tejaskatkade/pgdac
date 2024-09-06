package integerpkg;
/**
 * . Declare a method-local variable number of type int
 * with some value and convert it to a String using the
 * toString method. (Hint: Use Integer.toString(int)).
 */
public class Program3 {
    public static void main(String[] args) {
        int number = 123456;
        String strNum =  String.valueOf(number);
        System.out.println(strNum);
    }
}
