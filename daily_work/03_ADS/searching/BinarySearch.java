/*
 * Author : Tejas Katkade
 * 03/10/2024
 * Binary Search
 * 
 * - mid = low + (high - low) / 2;
 * - work on sorted array
 * - access through mid point value calculation
 * - access fast
 * - 1d
 * - complex operation
 * 
 */

public class BinarySearch {
    public static int binarySearch(int[] a, int key, int l, int h) {

        if( l < h ) {
            int mid = l + ( h -l )/2;
            if(a[mid] == key) {
                return mid;
            }
            if( a[mid] > key ) {
                return binarySearch(a, key, l, mid -1);
            }else {
                return binarySearch(a, key, mid+1, h);
            }
        } 
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr ={22,44,66,77,88,99};
        int n = arr.length;
        int res = binarySearch(arr,88,0,n-1);

        if((res == -1)){
            System.out.println("Not Found : ");
        }else{
            System.out.println("Key Found at index : "+res);
        }
    }
}
