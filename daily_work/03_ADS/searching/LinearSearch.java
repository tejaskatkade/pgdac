/**
 * Author : Tejas Katkade
 * 03/10/2024
 * Linear Search
 *                 key
 *  Best case    : 44   -> o(1)
 *  Average case : 55   -> o(n)
 *  Worst case   : 00   -> o(n)
 * 
 */
public class LinearSearch{
    public static int search(int[] arr, int key) {

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {44,66,77,33,55,88,99};
        int key = 88;
        int res;
        if((res = search(arr, key)) == -1){
            System.out.println("Key not Found : ");
        }else{
            System.out.println("Key Found at index : "+res);
        }
    }

}