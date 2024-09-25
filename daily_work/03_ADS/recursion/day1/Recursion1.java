public class Recursion1 {

	
	public static int show(int n) {	// recursion method
		if(n == 4)
			return n;
		return 2*show(n+1);	   
	}

	public static void main(String[] args) {
		System.out.println(show(2));		// call for method
	}
}