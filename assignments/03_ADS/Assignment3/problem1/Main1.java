/**
 * Implement a Stack using an array.
 * 
 * •	Test Case 1:
 * Input: Push 5, 3, 7, Pop
 * Output: Stack = [5, 3], Popped element = 7
 * 
 * •	Test Case 2:
 * Input: Push 10, Push 20, Pop, Push 15
 * Output: Stack = [10, 15], Popped element = 20
 * ________________________________________
 * 
 */
import stackdemo.StackDemo;

public class Main1{

    public static void main(String[] args) {
    
        StackDemo stack = new StackDemo();
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.push(15);
        stack.display();
    }
}