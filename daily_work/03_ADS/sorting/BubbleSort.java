
/**
 * Bubble sort
 * 
 * here, we compare every two elements
 * 1st iteration we campare first 2 ele then swap 1st  with 2nd position
 * then again compare 2nd and 3rd swap if required  
 * so in last largest elements is at last index
 * 
 * in 2nd iteration we again start from 1st to second last element
 * 
 * There fore for n elements we require n-1 iterations
 * 
 * 
 * complexity
 * best case : o(n)
 * wors case : o(n^2)
 * 
 * Internal sorting
 * stable sorting tech
 * 
 */


public class BubbleSort {

    public static void swap(int[] a, int i, int j ) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        
        for (int i = 0; i < n-1; i++) {
            int flag = 0;
            for (int j = 0; j < n-1-i; j++) {
                
                if(a[j] > a[j+1]) {

                    swap(a,j,j+1);
                    flag = 1;
                }
            }
            display(a);
            if(flag == 0){
                break;
            }
        }
    }

    public static void display(int[] a) {
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //int[] arr = {21,13,24,56,45,9,30};
        //int[] arr = {81,73,64,59,29,10};
        int[] arr = {2,3,4,56,9,30};
        display(arr);
        bubbleSort(arr);
       // display(arr);

    }       
    
}