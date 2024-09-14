/***
 * Write a program to find the missing number in an array of integers ranging from 1 to N.
 */

public class Program6 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,5,6,6,3,2};


        for(int i=1; i <= arr.length; i++){
            int flag = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
}
