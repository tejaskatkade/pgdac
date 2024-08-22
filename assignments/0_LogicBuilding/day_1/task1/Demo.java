// Write a Java program that checks if a predefined number is positive using an
// if-else statement and prints the appropriate message. 

import java.util.Scanner;

public class Demo {
    public static void isPositive(int number) {
        if(number < 0) {
            System.out.println(" Given number is Not positive ");
        }else if(number > 0) {
            System.out.println(" Given number is positive ");
        }else{
            System.out.println("Given number is neither positive nor negative");
        }
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        isPositive(number);

    }
}
