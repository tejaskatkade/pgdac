// Declare a single-dimensional array of 5 integers inside the main method. Traverse the array to
// print the default values. Then accept records from the user and print the updated values of the
// array.

import java.util.Scanner;

public class Program1 {


    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i<array.length) {
            array[i] = sc.nextInt();
            ++i;
        }
        for (int a : array) {
            System.out.println(a);
        }

        

        sc.close();
    }
    
}