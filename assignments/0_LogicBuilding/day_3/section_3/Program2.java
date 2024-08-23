
// Write a program to compute the factorial of the number 10

public class Program2 {
    public static void main(String[] args) {
        int number = 10;
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+number+" : "+ factorial);

    }

}
