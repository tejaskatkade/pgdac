import java.util.Scanner;

public class Program2 {
    static Scanner sc = new Scanner(System.in);
    private static void printRecord(int[] array) {
    
        for (int arr : array) {
            System.out.print(arr+"  ");
        }
        System.out.println();
    }
    
    private static void acceptRecord(int[] array) {
       for(int i = 0; i<array.length; i++){
            System.out.print("Enter Array["+i+"]  :  ");
            array[i] = sc.nextInt();
       }
    }
    public static void main(String[] args) {
    
        int[] array =  new int[5];
        acceptRecord(array);
        printRecord(array);
    }
}
