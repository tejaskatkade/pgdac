import java.util.Scanner;

class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();

        if(n>0){
            System.out.println("Number is Positive");
        }else if(n < 0){
            System.out.println("Number is negative");
        }else{

            System.out.println("Number is 0");
        }

        sc.close();
    }
}
