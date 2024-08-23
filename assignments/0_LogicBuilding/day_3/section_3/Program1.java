// Write a program to calculate the sum of the first 50 natural numbers. 


public class Program1 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=50; i++ ) {
            sum = sum + i;
        }
        System.out.print("sum of the first 50 natural numbers :");
        System.out.println(sum);

        System.out.print("sum of the first 50 natural numbers :");
        System.out.println((50 *(50+1))/2);
    }
}
