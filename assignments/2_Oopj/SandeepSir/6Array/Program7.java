import java.util.Scanner;

/**
 * Declare a single-dimensional array as a field inside a class and instantiate it inside the
 * class constructor. Define methods named acceptRecord and printRecord within the class and test
 * their functionality.
 */

class ArrayDemo {
    private int[] array;
    static Scanner sc = new Scanner(System.in);

    ArrayDemo(){
        this(5);    
    }
    ArrayDemo(int size){
        array = new int[size];
    }

    public void acceptRecord(){
        System.out.println("Enter array Elements  :  ");

        for(int i=0; i<array.length; i++){
            System.out.print("Array["+i+"]  :  ");            
            array[i] = sc.nextInt();
        }
    }

    public void printRecord(){
        System.out.print("Array Elements are : [");
        
        for(int i=0; i<array.length-1; i++){
            System.out.print(" "+ array[i] +",");            
        }
        System.out.println(" "+array[array.length-1]+" ]");
    }

    static void releseResource(){
        sc.close();
    }

    public static void main(String[] args) {
        ArrayDemo  arr = new ArrayDemo();
        arr.acceptRecord();
        arr.printRecord();
        ArrayDemo.releseResource();
    }
    
}

