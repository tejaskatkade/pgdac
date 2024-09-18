import java.util.Scanner;

/**
 *  Write a Java program to prove that Euclid’s algorithm computes
 * the greatest common divisor of two positive given integers.
 * 
 * 
 * a= 25 
 * b= 10
 * 25-10 =15
 * 15-10 = 5
 * 10- 5 = 5
 * 5 - 5 = 0
 * 
 */

public class Program1 {
    public static int big(int a, int b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static int small(int a, int b){
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static int findGCD(int a, int b) {
        int p , q, temp = 0;
        while (a > 0) {
            p = big(a, b);
            q = small(a, b);
            temp = p - q;
            a = temp;
            b = q; 
            if(a == b){
                return a;
            } 
        } 
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st value : ");
        int first = sc.nextInt();
        System.out.print("Enter the 2nd value : ");
        int second = sc.nextInt();

        System.out.println("GCD : "+findGCD(first,second));
        sc.close();
    }
}
