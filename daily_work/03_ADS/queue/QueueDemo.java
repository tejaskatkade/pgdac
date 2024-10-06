package queue;

public class QueueDemo {
    private static int[] arr;
    private static int  DEFAULT_SIZE = 5;
    private static int front, rear = -1;
    
    public QueueDemo() {
        this(DEFAULT_SIZE);
    }

    public QueueDemo(int size) {
        arr =  new int[size];
    }
    
    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == DEFAULT_SIZE - 1;
    }

    public void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue is Full ...!");
        }else {
            if(isEmpty())
                front++;
            arr[++rear] = data;
            System.out.println(data + " inserted successfully");
        }
    }

    public int dequeue() {
        
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }else{
            int val = arr[front++];
            if(front > rear)
                front = rear = -1;
            return val;
        }
    }



    public static void main(String[] args) {
        System.out.println("Tejas");

        QueueDemo queue = new QueueDemo();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // que full
        queue.enqueue(6);


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(7);
        queue.enqueue(8);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        // queue  is empty 
        System.out.println(queue.dequeue());
        
        

    }
}
