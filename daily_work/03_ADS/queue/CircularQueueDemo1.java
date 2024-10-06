package queue;

public class CircularQueueDemo1 {
    private static int[] arr;
    private static int  DEFAULT_SIZE = 5;
    private static int front = -1;
    private static int rear = -1;
    
    public CircularQueueDemo1() {
        this(DEFAULT_SIZE);
    }

    public CircularQueueDemo1(int size) {
        arr =  new int[size];
    }
    
    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return   (( front == 0 && rear == DEFAULT_SIZE-1) || (front - rear == 1 ));
    }

    public void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue is Full ...!");
        }else {
            if(front == -1){
                front++;
            }else{
                if(rear == DEFAULT_SIZE -1 ){
                    rear = -1;
                }
            }
            arr[++rear] = data;
            System.out.println(data + " inserted successfully");
        }
    }

    public int dequeue() {
        
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }else{
            int val = arr[front];
            if(front == rear) {
                front = -1;
                rear = -1;
            }else{
                if(front == DEFAULT_SIZE -1){
                    front = -1;
                }
                front++;
            }
            return val;
        }
    }



    public static void main(String[] args) {
        System.out.println("Tejas");

        CircularQueueDemo queue = new CircularQueueDemo();
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
