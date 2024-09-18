import java.util.Arrays;
import java.util.Scanner;

/***
 * Write a Java program to find the k largest elements in a given array.
 * Elements in the array can be in any order
 */

public class Problem2 {

    public static void findKLargest(int k, int[] arr){
        Arrays.sort(arr);

        int count = k-1;
        System.out.print(arr[arr.length-1]+" ");
        for(int i = arr.length-1; i>=0; i--) {
            if(arr[i] != arr[i-1]){
                System.out.print(arr[i-1]+" ");
                
                if(--count == 0)
                    break;
            }
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
        System.out.println("Enter the k : ");
        int k = sc.nextInt();

        findKLargest(k,array);
        sc.close();
    }
}
