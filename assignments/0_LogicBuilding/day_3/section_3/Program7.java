//Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6). 
public class Program7 {
    public static void main(String[] args) {
        int num = 9876;

        int sum = 0;

        while (num != 0) {
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}
