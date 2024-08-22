//Write a Java program that calculates the area of a rectangle using the formula
//area = length * width. Use predefined values for length and width. 

package task6;

import java.util.Scanner;

public class Demo {
    public static void findArea(int len, int width) {
        System.out.println("Arear of Rectangle is :"+ (len * width));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length ");
        int len = sc.nextInt();
        System.out.println("Enter Width ");
        int width = sc.nextInt();
        findArea(len, width);
    }
}
