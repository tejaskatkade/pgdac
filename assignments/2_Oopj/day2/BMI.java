import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your weight (kg)");
        float weight = sc.nextFloat();

        System.out.println("enter your height (m) ");
        float height = sc.nextFloat();

        float bmi = weight / (float)Math.pow(height, 2) ;
        System.out.println("Your BMI is : " + bmi);

        if(bmi < 18.5) {
            System.out.println(" You are UNDERWEIGHT");
        }else if (bmi <= 24.9) {
            System.out.println(" You are NORMAL");
        }else {
            System.out.println(" You are OVERWEIGHT");
        }
    }
}
