import java.util.Scanner;

class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1 : ");
        int num1 = sc.nextInt();
       
        System.out.println("Enter Num2 : ");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Both are equal");
        }else{
            int var = num1 > num2 ? num1 : num2;
            System.out.println(var + " is Greater");
        }
        sc.close();
    }
}
