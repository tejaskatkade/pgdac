// Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression
public class Program11 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        int z = ++x + y++;
        System.out.println(x); // 1
        System.out.println(y); // 1
        System.out.println(z); // 1
    }
}
