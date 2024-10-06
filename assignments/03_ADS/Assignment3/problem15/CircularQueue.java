package problem15;

public class CircularQueue {
    private int[] CQ;
    private int size;
    private int front;
    private int rear;

    public CircularQueue() {
        this(5);
    }

    public CircularQueue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        CQ = new int[size];
    }

    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        //return (front == 0 && rear == size-1) || (front == rear +1);
        return front == (rear + 1)%size;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if(isEmpty()) {
                front = 0;
            }
            rear = (rear + 1)%size;
            CQ[rear] = data;
        }
    }

    public int dequeue() {
        int val;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            val = CQ[front];
            front = (front + 1)%size;
            return val;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Que is Empty");
        } else {
            int i = front;
            System.out.print("[ ");
            while (i != rear) {
                System.out.print(CQ[i]+" ");
                i = (i +1)%size; 
            }
            System.out.println(CQ[rear]+"]");
        }
    }
}
