// Fibonancci series
// 0 1 1 2 3 5 8
// Fib(3)  = 


public class Program1{

	public static int fib(int n) {
		if( n<=1 )
			return n;
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
	
		System.out.println("fib(5) : "+fib(5));	
	}
}
 