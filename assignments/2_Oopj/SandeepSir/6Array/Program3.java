/**
 * Write a program to find the maximum and minimum values in a single-dimensional array of
 * integers.
 */
public class Program3 {
    
    public static void main(String[] args) {
        int arr[] = {1,3,8,5,7,4,2,9,0};

        findMinMax(arr);
    }

    private static void findMinMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Minimum :   "+min);
        System.out.println("Maximum :   "+max);
        
    }

}
