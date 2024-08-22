// : Write a Java program that checks if a predefined number is negative using an
// if-else statement and displays the result

package task2;

import java.util.Scanner;

public class Demo {
    public static void isNegative(int number) {
        if(number < 0) {
            System.out.println(" Given number is Negative ");
        }else if(number > 0) {
            System.out.println(" Given number is Not Negative ");
        }else{
            System.out.println("Given number is neither positive nor negative");
        }
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        isNegative(number);

    }
}
