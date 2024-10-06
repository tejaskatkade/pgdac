package problem1;

import java.util.Scanner;

public class Sorting {
	public static void print(int[] arr) {
		
		for(int i : arr) {
			System.out.print(i +" ");
		}
		System.out.println();
	}

	public static void set(int[] a, int i, int store) {
		int temp = a[i];
		a[i] = store;
	}
	public static void sort(int[] arr) {
		int i =arr.length-1;
		int j =arr.length-1;
		
		
		while(j >= 0 && i>= 0) {
			int store = arr[i];
			if(arr[j] > arr[i]) {
				arr[i] = arr[j];
				print(arr);
				set(arr,j,store);
				i--;
			}
			j--;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sort(arr);
		print(arr);
		
	}
}