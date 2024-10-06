class DequeDemo{
	static int[] DQ;
	static int size;

	static int front = -1;
	static int rear = -1;
	
	public DequeDemo() {
		this(5);
	};
	public DequeDemo(int size) {
		this.size = size;
		DQ = new int[size];
	};


	public boolean isEmpty(){
		return front == -1;
	}

	public boolean isFull(){
		return (front == 0 && rear == size-1) || (front == rear+1);	
	}


	// 1 2 3 4 5 6 7
	public void enterFront(int data){
		if(isFull()) {
			System.out.println("Queue is full");
		}else{
			//System.out.println("Front : "+front);
			if(front == -1){
				front = 0;
				rear = 0;
			//System.out.println("Front : "+front);
			}else if(front == 0){
				front = size - 1;
			//System.out.println("Front : "+front);
			}else{
				front = front - 1;
			//System.out.println("Front : "+front);
			}
			System.out.println("Front : "+data);
			DQ[front] = data;
		}
		
	}

	public void enterRear(int data){
		if(isFull()) {
			System.out.println("Queue is full");
		}else{
			
			if(front == -1){
				front = 0;
				rear = 0;
			}else if(rear == size -1){
				rear = 0;
			}else{
				rear = rear + 1;
			}
			System.out.println("Rear : "+data);
			DQ[rear] = data;
		}

	}

	public int deleteFront(){
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -999;
		}else{
			int val = DQ[front];
			if(front == rear){
				front = -1;
				rear = -1;
			}else if(front == size -1){
				front = 0;
			}else{
				front = front + 1;
			}
			return val;
		}

	}
// 10 40 50 30 20
//        r  f
	public int deleteRear(){
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -999;
		}else{
			int val = DQ[rear];

			if(front == rear){
				front = -1;
				rear = -1;
			}else if(rear == 0){
				rear = size -1;
			}else{
				rear = rear - 1;
			}

			return val;
		}

	}

	public void display(){
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else{ 
			System.out.print("[ ");
			int i = front;
			int j = rear;
			while(i != j){
				System.out.print(DQ[i]+" -> ");
				if(i == size -1){
					i = 0;
				}else{
					i = i + 1;
				}				
			}
			System.out.println(DQ[i]+" ]");
		}
	}
} 

public class DQMain{
// 10 40 50 30 20
//        r  f

	public static void main(String[] args) {
		DequeDemo deque = new DequeDemo();
		deque.enterFront(10);
		deque.enterFront(20);
		deque.enterFront(30);
		deque.enterRear(40);
		deque.enterRear(50);
		deque.enterFront(60);
		
		deque.display();
		System.out.println("Front : "+deque.front+"\nRear : "+deque.rear);
		
		System.out.println(deque.deleteFront());
		deque.display();
		System.out.println(deque.deleteRear());
		deque.display();
		System.out.println(deque.deleteRear());
		deque.display();
	} 
} 