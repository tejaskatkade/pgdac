package integerpkg;

/***
 * . Declare a method-local variable strNumber of type
 * String with some integer value and convert it to the
 * corresponding wrapper class using Integer.valueOf().
 * (Hint: Use Integer.valueOf(String)).
 */


public class Program7 {
    public static void main(String[] args) {
        
        String strNum = "1234567";
        Integer num = Integer.valueOf(strNum);
        System.out.println(num);
    }
}
