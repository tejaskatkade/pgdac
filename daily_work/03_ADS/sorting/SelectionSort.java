import java.util.Arrays;

/**
 * 
 * Seleciton sort
 * 
 * pick the minimum value from array and swap it with first element and so on
 *
 * Identify the minimum value and add it to sorted part
 *  
 * Repeatedly finds the minimum ele from the unsorted part and swaps it with the first unsorted elements;
 * 
 * Complexity
 * ________________________________________________________
 * Best case :  * O(n^2)
 * Avg case :  * O(n^2)
 * worst case :  * O(n^2)
 * 
 * Technique : Internal sorting
 * Not a stable Algorithm 
 * 
 * In the first iteration we get smallest or largest element
 * 
 */


public class SelectionSort {

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
 
    static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n ; j++) {

                // find the index of min value
                if(arr[j]   <  arr[min] ) {
                    min = j;
                }
            }
            swap(arr, min, i);
            System.out.println(Arrays.toString(arr));
           
        }
    } 
    public static void main(String[] args) {
        int[] arr = {24,13,2,56,45};
       
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
