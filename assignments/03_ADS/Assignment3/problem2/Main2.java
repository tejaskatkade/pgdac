import stackdemo.StackDemo;

/**
 * Check for balanced parentheses using a stack.
 * •	Test Case 1:
 * Input: "({[()]})"
 * Output: Balanced
 * •	Test Case 2:
 * Input: "([)]"
 * Output: Not Balanced
 * ________________________________________
 * 
 * 
 */



public class Main2{

    static boolean checkParenthesis(String str) {
       
        StackDemo stack = new StackDemo();
        
        for (int j = 0; j < str.length(); j++) {
            if(
                str.charAt(j) == '(' || 
                str.charAt(j) == '[' || 
                str.charAt(j) == '{' 
            ) {

                stack.push(str.charAt(j));  
                 
            }else if(
                

                str.charAt(j) == '}' && (char)stack.pop() != '{' ||
                str.charAt(j) == ')' && (char)stack.pop() != '(' ||
                str.charAt(j) == ']' && (char)stack.pop() != '['    
            ){
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;

    } 

    public static void main(String[] args) {
    
        String input = "adf(as{d[(ddf)fd]ff}s)";
        if(checkParenthesis(input)) {
            System.out.println("Balanced");
        }else {
            System.out.println("Not Balanced");
        }    
    }
}