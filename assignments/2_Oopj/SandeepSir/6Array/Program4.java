/**
 * Write a program to remove duplicate elements from a single-dimensional array of integers.
 */
public class Program4 {
   
    public static void main(String[] args) {
        int[] arr =  new int[]{3,5,7,9,1,3,4,5,6,7,8,2,3,5,6};

        int[] array = removeDuplicates(arr);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }

    private static int[] removeDuplicates(int[] arr) {
        int[] array = new int[arr.length];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
        //arr    // 1 1 2 2 3 3 4 4 2 2 1
        //array  // 0 0 0 0 0 0 0 0 0 0 0 
            int flag = 0;
            for(int j=0;j< arr.length; j++){
                if(arr[i] == array[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                array[k++]=arr[i];
            }
        }
        return array;
    }
}
