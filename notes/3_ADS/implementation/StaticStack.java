package implementation;

import exception.StackException;

public class StaticStack{
    
    protected int[] arr;
    private final static int DEFAULT_SIZE = 5;
    private static int top = -1;

    public StaticStack() {
        this(DEFAULT_SIZE);
    }

    public StaticStack(int size) {
        this.arr = new int[size];
    }

    public boolean push(int data) throws StackException {
        if(isFull()) 
            throw new StackException("Stack is Full...!");
        arr[++top] = data;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty())
            throw new StackException("Stack is Empty...!");
        return arr[top--];
    }

    public int peek() throws StackException {
        if(isEmpty())
            throw new StackException("Stack is Empty...!");
            return arr[top];
    }

    public boolean isFull(){
        return top == arr.length -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

}