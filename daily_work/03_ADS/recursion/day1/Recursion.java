public class Recursion {

	static int i = 0;
	public static void show() {	// recursion method
		
		if( ++i <= 5 ) {   // termination/ base condition
												System.out.println("Hi Boyss....");
			show();	   // recursive call
		}
	}

	public static void main(String[] args) {
		show();		// call for method
	}
}