import java.util.Arrays;
/**
 * 
 * TC 
 * Best case  : o(nlogn)
 * worst case : o(nlogn)
 * Avg case   : - o(nlogn)
 * 
 * Space C  : O(n)
 * 
 * Internal / External sorting
 * Stable Algo
 * 
 * srategy : Divide and Conqure
 * 
 * 
 */

public class MergeSort {
    static void merge(int[] arr,int l, int m, int h ) {
        int n1 = m-l+1;
        int n2 = h-m;


        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(int i=0; i<n1; i++) {
            L[i] = arr[l+i];
        }
        
        for(int j=0; j<n2; j++) {
            R[j] = arr[m+1+j];
        }

        int i=0, j=0;
        int k = l;
        while (i<n1 && j<n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        System.out.print(Arrays.toString(L));
        System.out.print("   ----    ");
        System.out.println(Arrays.toString(R));

    }

    static void mergeSort(int[] arr, int l,int h) {
        if(l<h) {
            //int m = (l+h)/2;    // mid
            //int m = (l+(h-l))/2;    // WRONG
            int m = l + (h-l)/2;    
            mergeSort(arr, l, m);   // left array
            mergeSort(arr, m+1, h); // right array
            merge(arr,l,m,h);       // merge array
        }
    }

    public static void main(String[] args) {
        int[] arr = {24,13,2,56,45};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
