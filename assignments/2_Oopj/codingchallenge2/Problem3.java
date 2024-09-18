import java.util.Scanner;

/***
 * 
 * Write a Java program to find the numbers greater than the average of the numbers of a
 * given array (Use scanner class to input and Array, below picture is example do not make
 * static array as repsrented in example)
 */

 public class Problem3{

    public static void findGreater(int[] array){
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        int average = sum/array.length;
        System.out.println("The average is : "+average);
        System.out.print("The num Greate than Average are : ");
        for (int i = 0; i < array.length; i++) {
            if(array[i] > average){
                System.out.print(array[i] + " ");
            }
        }
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

        findGreater(array);
        sc.close();
    }
 }