package problem6;

public class Main6 {
    public static void main(String[] args) {
        QueueDemo que = new QueueDemo(7);
        
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(5);
        que.enqueue(6);
        que.enqueue(7);
        que.displayQueue();
        que.enqueue(7);
        
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.displayQueue();
        que.dequeue();
        que.displayQueue();
        que.dequeue();
        que.displayQueue();
    }
}
