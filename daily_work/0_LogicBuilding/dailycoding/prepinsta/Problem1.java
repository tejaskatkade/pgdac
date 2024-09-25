

// Find the Sum of First N Natural Numbers using java

import java.util.Scanner;

class Problem1{

    private static int findSum1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    
    private static int findSum2(int n) {
        
        return (n * (n+1))/2;
    }
    private static int findSum3(int n) {
        if(n == 1)
            return 1;
        return n + findSum3(--n);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();

        System.out.println(findSum1(n));
        System.out.println(findSum2(n));
        System.out.println(findSum3(n));

        sc.close();
    }

    
}