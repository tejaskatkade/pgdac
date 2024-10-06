import java.util.Arrays;
/**
 * Tc 
 * best case : o(nlogn)
 * avg case : o(nlogn)
 * worst case : o(nlogn)
 * 
 * sc : o(logn)  due to recursion
 * 
 * Not stable
 * Internal sorting tech
 * 
 */
public class QuickSort {

    public static void swap(int[] a, int i, int j ) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int partition(int[] arr, int low, int high) {
       int pivot = arr[high];
       int i = low-1;

       for (int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr,i,j);
            }
       }
       swap(arr,i+1,high);
       System.out.println(Arrays.toString(arr));
       return  i+1;
    }

    static void quickSort(int[] arr, int low, int high) {
        if(low< high) {
            int pos = partition(arr,low,high);
            System.out.println("Pivote : "+ arr[pos]);
            quickSort(arr, low, pos-1);
            quickSort(arr, pos+1, high);
        }
    }
    
    public static void main(String[] args) {
         int[] arr = {50,18,69,8,9,32};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
