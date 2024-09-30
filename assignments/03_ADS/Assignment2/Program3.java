// Remove White Spaces from String

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Program3{
	public static String removeSpaces(String str) {
		int i=0;
		while(i<str.length()) {
			if(str.charAt(i) == ' '){
				str = str.substring(0,i)+str.substring(i+1);
			}
			i = i +1;	
		}
		return str;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str = br.readLine();
		System.out.println(removeSpaces(str));
	}
}