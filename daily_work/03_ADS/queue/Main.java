package queue;


public class Main {
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
