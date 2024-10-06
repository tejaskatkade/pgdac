package demo1;

public class StackUsingArray{
    static final int MAX = 10;
    int top = -1;
    int[] a = new int[MAX];

    boolean isfull() {
        return top == MAX-1;
    }
    boolean isEmpty(){
        return top == -1;
    }

    void push(int element) {
        if(isfull())
            System.out.println("Stack is Full");
        else{
            a[++top] = element;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return a[top--];
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return a[top];
        }
    }

    public static void main(String[] args) {
        StackUsingArray stack= new StackUsingArray();
        stack.push(4); 
        stack.push(5); 
        stack.push(6);
        System.out.println(stack.peek()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        
    }
}