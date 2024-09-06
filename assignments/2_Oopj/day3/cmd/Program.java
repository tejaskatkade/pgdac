package cmd;

/**
 * Write a program that accepts two integers and an arithmetic operator (+, -, *, /) from the
 * command line. Perform the specified arithmetic operation based on the operator provide
 * (Hint: Use switch-case for operations).
 */
class Program {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String operator = args[1];

        switch (operator) {
            case "+":
                System.out.println("Addition : "+num1+num2);
                break;
            case "-":
                System.out.println("Subtraction : "+(num1-num2));
                
                break;
            case "*":
                System.out.println("Multiplication : "+(num1*num2));
                
                break;
            case "/":
                System.out.println("Division : "+(num1/num2));
                
                break;
        
            default:
                System.out.println("Wrong operator");
                break;
        }
        
    } 
}
