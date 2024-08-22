// Write a Java program that checks if a predefined number is odd or even. Use
// an if-else statement and the modulus operator (%) to determine whether the number is
// divisible by 2 or not.
package task3;

import java.util.Scanner;

public class Demo {

    public static void isEvenOrOdd(int number) {
        if(number % 2 == 0) {
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        isEvenOrOdd(number);
    }
}
