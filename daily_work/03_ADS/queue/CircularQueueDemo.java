package queue;

public class CircularQueueDemo {

    private static int[] arr;
    private static int  size = 5;
    private static int front = -1;
    private static int rear = -1;
    
    public CircularQueueDemo() {
        this(size);
    }

    public CircularQueueDemo(int size) {
        arr =  new int[size];
    }
    
    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return   (rear + 1) % size == front;
    }

    public void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue is Full ...!");
        }else {
            if(front == -1){
                front++;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
            System.out.println(data + " inserted successfully");
        }
    }

    public int dequeue() {
        
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
            int val = arr[front];
            if(front == rear) {
                front = -1;
                rear = -1;
            }else{
                front = (front + 1)%size;
            }
            return val;
        
    }

}
