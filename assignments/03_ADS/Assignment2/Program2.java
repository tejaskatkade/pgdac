// 2. Remove Array Duplicates
// Problem: Write a Java program to remove duplicates from a 
// sorted array and return the new length of the array.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Program2{
	
	public static int removeDuplicates(int[] arr) {
		int count = 1;
		int ptr = 0;
		for(int i = 1; i<arr.length; i++){
			if(arr[ptr] != arr[i]){
				count++;
				ptr = i;
			}	
		}
		return count;	
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];

		System.out.println("Enter array elements");
		for(int i =0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());	
		}
			
		System.out.println(removeDuplicates(arr));
	}

}