import java.util.Scanner;

/***
 * 
 * Write a Java program to move every positive number to the right and every negative
 * number to the left of a given array of integers
 */

 public class Problem4{

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static int sort(int[] array) {
    
        int j = 0;
        while (j < array.length) {
            if(array[j] > 0){
                break;
            }
            j++;
        }

        if(j == array.length ){
            return 0;
        }
        int i = j +1;
        while (i < array.length) {
            if(array[i] < 0){
                swap(i,j,array);
                j++;
            }

            i++;
        }
        return 0;
    }
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);
        System.out.println("Sorted array");
        for (int i : array) {
            System.out.print(i);
        }
        sc.close();
    }

    
 }