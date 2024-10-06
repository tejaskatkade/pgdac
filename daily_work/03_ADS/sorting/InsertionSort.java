import java.util.Arrays;

/**
 * 
 * Insertion sort
 * 
 * we are taking one one element from unsorted array insert it in porper sorted manner
 *  just add the data from unsorted part to sorted part
 * 
 * so in array we have two parts sorted and not soted
 *  
 *  sorted  |   unsorted                               
 *    4  5  |  7  2   11  9   6
 *   
 *    sorted  |   unsorted              
 *   4  5  7  |  2  11  9   6   
 *  
 *       sorted  |   unsorted        
 *   2  4  5  7  |  11  9   6   
 * 
           sorted  |   unsorted         
    2  4  5  7  11 |  9   6     
 * 
 *            sorted  |   unsorted  
 *  2  4  5  7  9  11 |   6     
 * 
 *               sorted  |   unsorted               
 *  2  4  5  6  7  9  11 |
 * 
 * 
 * Complexity :
 * 
 * Best case : o(n)  -> as we are not entering in while loop if it is sorted
 * avg case : o(n^2)
 * worst case : o(n^2)
 * 
 * 
 * Stable Sorting technique
 * Internal sorting
 * 
 * Space complexity : o(1) 
 * 
 *  
 */

public class InsertionSort {

    public static void insertion(int[] arr ) {

        // the first element is always sorted considering that it is only ele in sorted array
        // so start with 1

        for (int i = 1; i < arr.length; i++) {
            
            int key = arr[i];
            
            int j = i-1;
            
            // j >= 0  array starts at 0 so we need to stop at zero 
            // also move till you didnt get ele smaller than key
            // ie. move untile ele are bigger than key

            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            // when we come out of loop we are one index before the exact position of key as the last lime 
            // in while decreaments value of j so we need add key at j+1 index 
            arr[j+1] = key;
            System.out.println(Arrays.toString(arr));          
        }

    }

     public static void main(String[] args) {
        int[] arr = {24,13,2,56,45};
       
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
}
