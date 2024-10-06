package demo2;
public class StackDemo {
    static final int MAX = 20;
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
}
