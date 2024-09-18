import java.util.Scanner;

/***
 * Write a Java program to find the median of the number inside the window (size k) at each
 * moving in a given array of integers with duplicate numbers. Move the window from the start
 * of the array.
 * 
 */

public class Problem5{


    public static void findMedian(int i, int j, int[] arr) {
        int mid = (i+j)/2;
        System.out.print(arr[mid]+" ");
    }

    public static void findMedianInWindow(int k , int[] arr) {
        int j = k-1;
        for(int i=0; j<arr.length; i++,j++) {
            findMedian(i,j,arr);
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the window size : ");
        int k = sc.nextInt();

        findMedianInWindow(k,array);
        sc.close();
    }    
}