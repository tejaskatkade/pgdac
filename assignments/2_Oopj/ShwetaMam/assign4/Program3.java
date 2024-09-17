/**
 *  Write a program that performs arithmetic operations involving different 
 * data types (int, double, float) and observes how Java handles widening
 * conversions automatically.
 */
public class Program3 {
   public static void main(String[] args) {
    int i = 10;
    double d = 45.555d;
    float f = 12.5f;

    double result1 = i + d; 
    double result2 = d + f;
    float result3 = i + f;

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    
   } 
}
