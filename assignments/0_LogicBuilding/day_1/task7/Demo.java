// Write a Java program that finds and prints the largest of three predefined numbers using if-else statements

package task7;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a , b, c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b) {
            if(b > c) {
                System.out.println(a + " is bigger");
            }else {
                if(c > a) {
                    System.out.println(c + " is bigger");
                }
            }
        }else{
            if(b > c) {
                System.out.println(b + " is bigger");
            }else {
                System.out.println(c + " is bigger");

            } 
        }
    }
}
