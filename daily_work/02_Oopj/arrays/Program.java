package arrays;

public class Program {


    static int[] array = new int[10];

    public static void main(String[] args) {
        // int[] arr = new int[];
        // NOT OK 
        // Variable must provide either dimension expressions or an array initializer
    

        int[] arr = new int[5];
        //OK

        int size = 5;
        int[] arr1 = new int[size];


        int[] arr2 = new int[-5]; //java.lang.NegativeArraySizeException: -5


        
    }
}
