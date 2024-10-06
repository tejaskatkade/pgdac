package test;

import exception.StackException;
import implementation.DynamicStack;
//import implementation.StaticStack;

public class Main {
    public static void main(String[] args) {

        //StaticStack stack = new StaticStack();
        DynamicStack stack = new DynamicStack();
     
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.push(60);
            stack.push(70);
            stack.push(80);
            stack.push(90);
            stack.push(100);

            System.out.println(stack.peek());
            System.out.println(stack.pop());

            System.out.println(stack.peek());
            System.out.println(stack.pop());
            
            System.out.println(stack.peek());
            System.out.println(stack.pop());

            System.out.println(stack.peek());
            System.out.println(stack.pop());

            System.out.println(stack.peek());
            System.out.println(stack.pop());
           
            System.out.println(stack.peek());
            System.out.println(stack.pop());
           
            System.out.println(stack.peek());
            System.out.println(stack.pop());
           
            System.out.println(stack.peek());
            System.out.println(stack.pop());
           
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            
            // System.out.println(stack.peek());
            // System.out.println(stack.pop());
           
            

        } catch (StackException e) {
            e.printStackTrace();
        }
        
        
    }
}
