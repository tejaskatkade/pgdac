package queue;

public class DequeDemo {
    
    int size = 5;
    int D[] = new int[size];
    int front = -1;
    int rear = 0;

    boolean isEmpty() {
        return front == -1;
    }
    boolean isFull() {
        return (front == 0 && rear == size-1) || (front == rear + 1);

    }

    void insertFront(int data) {
        if(isFull()) {
            System.out.println("Deque is Full");
        }else{
            if(front == -1){
                front = 0;
                rear = 0;
            }else if(front == 0){
                front = size -1;
            }else{
                front = front -1;
            }
            D[front] =data;
        }
    }
    void insertRear(int data) {
        if (isFull()) {
            System.out.println("Deque is full ");
        } else {
            if( front == -1){
                front = 0;
                rear = 0;
            }else if(rear == size -1) {
                rear = 0;
            }else{
                rear = rear +1;
            }
            D[rear] =data;
        }
    }

    void deleteFront() {
        if(isEmpty()) {
            System.out.println("Deque is Empty ...");
        }else{
            if(front == rear) {
                front = -1;
                rear = -1;
            }else if(front == size -1){
                front = 0;
            }else{
                front = front+1;
            }
        }
    }
    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
        } else {
            if(front == rear) {
                front = -1;
                rear = -1;
            }else if(rear == 0){
                rear  = size -1;
            }else{
                rear = rear +1;
            }
        }
    }

    int getFront(){
        if(isEmpty()) {
            System.out.println("Empty..");
            return -1;
        }
        return D[front];
    }

    int gerRear(){
        if(isEmpty() || rear < 0) {
            System.out.println("Empty..");
            return -1;
        }
        return D[rear];
    }


    public static void main(String[] args) {
        
    }
}
