/***
 * Write a program to find the intersection of two single-dimensional arrays.
 */

import java.lang.Math;

public class Program5 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{2,3,4,5,6,7};
        int[] arr2 = new int[]{2,3,6,7,8,9};

        int k =0;
        int size = Math.min(arr1.length, arr2.length);
        int[] array = new int[size];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    array[k++] = arr1[i];
                    break;
                }
            }
        }

        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
