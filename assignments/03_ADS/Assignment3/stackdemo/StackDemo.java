package stackdemo;

public class StackDemo {
    private int[] A;
    private int size;
    private int top = -1;


    public StackDemo() {
        this(10);
    }
    public StackDemo(int size) {
        this.size = size;
        A = new int[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;

    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is Full !!");
        }else {
            A[++top] = data;
            //System.out.println(data +" is pushed");
        }
    }

    public int pop() {
        if(isEmpty()) {
            //System.out.println("Stack is Empty !!");
            return -1;
        }else {
            int data = A[top--];
            //System.out.println(data +" is poped");
            return data;
        }
    }

    public int peep() {
        if(isEmpty()) {
            System.out.println("Stack is Empty !!");
            return -1;
        }else {
            int data = A[top];
            //System.out.println(data +" is at peek");
            return data;
        }
    }

    public void display() {
        int temp = 0;
        System.out.print("[ ");
        while (temp <= top) {
            System.out.print(A[temp]+" ");
            temp++;
        }
        System.out.println("]");

    }

}
