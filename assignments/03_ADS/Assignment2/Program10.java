// Array Left Rotation

import java.util.Scanner;

public class Program10 {
    public static void reverseArray(int arr[], int start, int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

    static void leftRotate(int arr[], int d){
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[]= new int[size];

		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
        System.out.println("Enter pos to rotate");
        int d = sc.nextInt();
        leftRotate(arr,d);
        
        for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
        System.out.println();
        sc.close();
    }
}
