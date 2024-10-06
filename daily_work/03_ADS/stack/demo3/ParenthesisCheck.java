package demo3;

public class ParenthesisCheck {
    static boolean checkParenthesis(StringBuffer str){

        int length = str.length();

        StackDemo stack = new StackDemo();
        for (int i = 0; i < length/2; i++) {
            stack.push(str.charAt(i));
        }

        for (int i = length/2; i < length; i++) {
            if (!(str.charAt(i) != (char)stack.peek())) {
                System.out.println((char)stack.pop());
                return false;
            }
            // System.out.println((char)str.charAt(i));
            // System.out.println(stack.pop());
        }

        if(stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkParenthesis(new StringBuffer("((())()")));
    }
}
