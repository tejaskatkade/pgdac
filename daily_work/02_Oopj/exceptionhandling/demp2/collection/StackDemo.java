package exceptionhandling.demp2.collection;

import java.util.Scanner;

import exceptionhandling.demp2.exception.StackOverFlowException;
import exceptionhandling.demp2.exception.StackUnderFlowException;

public class StackDemo {
    int top = -1;
    int arr[];

    public StackDemo(){
        this(5);
    }

    public StackDemo(int size){
        arr = new int[size];
    }


    public boolean isFull(){
        return top == arr.length -1;            
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public void push(Scanner sc)throws StackOverFlowException{
        if(isFull()){
            throw new StackOverFlowException("Stack is full...");
        }
        System.out.print("Enter element : ");
        arr[++top] = sc.nextInt();
    }

    public void pop()throws StackUnderFlowException{
        if(isEmpty()){
            throw new StackUnderFlowException("Stack is Empty..");
        }
        --top;
    }
    public void peek()throws StackUnderFlowException{
        if(isEmpty()){
            throw new StackUnderFlowException("Stack is Empty..");
        }
        System.out.println(+arr[top]);
    }
}
