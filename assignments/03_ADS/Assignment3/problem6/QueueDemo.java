package problem6;

public class QueueDemo {
    
    private int[] Q;
    private int front;
    private int rear;
    private int size;

    QueueDemo() {
        this(10);
    }
    QueueDemo(int size) {
        this.size = size;
        Q = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size -1;
    }

    public void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()) {
            front =0; 
        } 
        Q[++rear] = data; 
        System.out.println(data +" is enqued");
    }

    public int dequeue() {
        int val =  Integer.MIN_VALUE;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            val = Q[front++];

            if(front > rear) {
                front = -1;
                rear = -1;
            }
        }
        return val;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("[ ");
            for (int i = front; i <= rear; i++) {
                System.out.print(Q[i]+" ");
            }
            System.out.println("]");
        }
    }

}
