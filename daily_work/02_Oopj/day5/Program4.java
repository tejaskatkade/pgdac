import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        
        final int num1 = 10;
        System.out.println(num1);
        //num1 = num1 + 5; // not ok

        final int num2;
        num2 = 25;
        System.out.println(num2);    

        Scanner sc = new Scanner(System.in);

        System.out.print("num   :   ");
        final int num = sc.nextInt();
        System.out.println(num);

        sc.close();     
    }
}
