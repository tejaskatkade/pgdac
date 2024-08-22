// Question 3: Calculator
// Write a program that acts as a simple calculator. It should accept two numbers and an operator
// (+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested ifelse to check if division by zero is attempted and display an error message. 


package task2;
public class Problem3 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 7;
        String operator = "/";

        switch (operator) {
            case "+":
                System.out.println("Answer : "+ (num1+num2));
                break;
            case "-":
                System.out.println("Answer : "+ (num1-num2));
                break;
            case "*":
                System.out.println("Answer : "+ (num1*num2));
                break;
            case "/":
                if(num2 == 0){
                    System.out.println("Error : Divide by Zero");
                }else {
                    System.out.println("Answer : "+ (num1/num2));
                }
                
                break;
        
            default:
                System.out.println("Invalid Operator");
        }

    }
    
}
