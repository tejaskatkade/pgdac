import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }

        sc.close();
    }    
}
