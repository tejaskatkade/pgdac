// Write a Java program that displays a "Good Morning" message if the
// predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.
package task4;

import java.util.Scanner;

public class Demo {
    public static void isMorning(int hour, String periods) {
        if(periods.equals("AM")) {
            if(hour < 12 && hour > 5) {
                System.out.println("Good Morning");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time (1 to 12)");
        int hour = sc.nextInt();
        
        System.out.println("Enter hours (AM / PM)");
        String periods = sc.next();

        isMorning(hour, periods);
    }
    
}
