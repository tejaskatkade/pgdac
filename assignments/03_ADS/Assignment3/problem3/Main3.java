import stackdemo.StackDemo;

/**
 * Reverse a string using a stack.
 * Test Case 1:
 * Input: "hello"
 * Output: "olleh"
 * Test Case 2:
 * Input: "world"
 * Output: "dlrow"
 * 
 */


public class Main3{

    static void reverseString(String str) {
        StackDemo stack = new StackDemo();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String res = "";

        for (int i = 0; i <str.length(); i++) {
         res = res + (char)stack.pop();   
        }
        System.out.println(res);
        

    }
    public static void main(String[] args) {
        reverseString("tejas");
        
    }
}