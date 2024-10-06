package problem7;

public class Main7 {
    public static void main(String[] args) {
        CircularQueue cqueue = new CircularQueue();
        cqueue.enqueue(10);
        cqueue.enqueue(20);
        cqueue.enqueue(30);
        cqueue.enqueue(40);
        cqueue.enqueue(50);
        cqueue.display();
        cqueue.dequeue();
        cqueue.dequeue();
        cqueue.enqueue(60);
        cqueue.enqueue(70);
        cqueue.display();
        
    }
}
