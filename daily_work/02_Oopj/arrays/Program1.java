import java.util.Arrays;

public class Program1 {

    public static void printArray(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Arrays.toString()");
        System.out.println(Arrays.toString(arr));

        System.out.println("Stream");
        Arrays.stream(arr).forEach(System.out::println);


    }

    public static void main(String[] args) {
    
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9};
        printArray(arr);


    }
}
