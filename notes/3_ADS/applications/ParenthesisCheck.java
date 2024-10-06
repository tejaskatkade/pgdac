package applications;

import exception.StackException;
import implementation.DynamicStack;

public class ParenthesisCheck {

    static boolean checkParenthesis1 (StringBuffer str) throws StackException {
        DynamicStack stack = new DynamicStack();

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            if (ch1 == '(') {
                stack.push(ch1);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char ch2 = (char)stack.pop();
                if(ch2 == '(' && ch1 == ')') {
                    //stack.pop();
                }else{
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }
    
    static boolean checkParenthesis2 (StringBuffer str) throws StackException {
        DynamicStack stack = new DynamicStack();

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            if (ch1 == '(' || ch1 == '[' || ch1 == '{' ) {
                stack.push(ch1);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char ch2 = (char)stack.pop();
                if(ch2 == '(' && ch1 == ')' ||
                   ch2 == '[' && ch1 == ']' ||
                   ch2 == '{' && ch1 == '}' 
                ) {
                    // nothing to do
                }else{
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }
    
    
    public static void main(String[] args) {
        try {
            System.out.println(checkParenthesis1(new StringBuffer("((()))")));
            System.out.println(checkParenthesis2(new StringBuffer("[]{[[{()}]]([])}")));
        } catch (StackException e) {
            e.printStackTrace();
        }   
    }
}
