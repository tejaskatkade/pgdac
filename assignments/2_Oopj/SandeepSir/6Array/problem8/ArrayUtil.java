package problem8;

import java.util.Scanner;

public class ArrayUtil {
    static Scanner sc = new Scanner(System.in);

    private ArrayDemo arrayDemo;
    private int[] array;

    public void acceptRecord(){
        System.out.println("Enter array Elements  :  ");

        arrayDemo = new ArrayDemo();
        this.array = arrayDemo.getArray();

        for(int i=0; i<array.length; i++){
            System.out.print("Array["+i+"]  :  ");            
            array[i] = sc.nextInt();
        }

        //arrayDemo.setArray(array);
    }

    public void printRecord(){

        this.array = arrayDemo.getArray();

        System.out.print("Array Elements are : [");
        
        for(int i=0; i<array.length-1; i++){
            System.out.print(" "+ array[i] +",");            
        }
        System.out.println(" "+array[array.length-1]+" ]");
    }

    public int menuList(){
        System.out.println("0. EXIT");
        System.out.println("1. ACCEPT RECORD");
        System.out.println("2. PRINT RECORD");
        System.out.print("ENTER CHOICE  :   ");
        return sc.nextInt();
    }

    static void releseResource(){
        sc.close();
    }
}
