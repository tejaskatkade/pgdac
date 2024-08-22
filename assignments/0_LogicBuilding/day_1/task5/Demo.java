// Write a Java program that calculates the area of a square using the formula
// area = side * side. Use a predefined side length. 

package task5;

import java.util.Scanner;


public class Demo {

    public static void findArea(int side) {
        System.out.println("Arear of Square is :"+ (side * side));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side ");
        int side = sc.nextInt();
        findArea(side);
    }
}

