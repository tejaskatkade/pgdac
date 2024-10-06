package linkedlist;

class NodeDemo1{
	Node head;
	class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}	
	Node createNode(int data) {
		return new Node(data);
	}
	void addFirst(int data) {
		Node newNode = createNode(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}

	
	void addLast(int data) {
		
		Node temp = head;
		if(temp == null){
			addFirst(data);
		
		}else {
			Node newNode = createNode(data);
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	void addAtPos(int data, int pos) {
		if(pos < 1 ){ // NEED TO MODIFY			
			System.out.println("Invalid position");
		}else if(pos == 1){ // add one more condition for add last;
				addFirst(data);
		}else{
			Node newNode = createNode(data);
			Node temp = head;
			while(pos - 2 != 0) {
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			
		}
	}

	

	void deleteFirst(){
		if(head == null){
			System.out.println("List is Empty");
		}else{
			if(head.next != null){
				head = head.next;
			}else{
				head = null;
			}
		}	
	}

	void deleteLast() {
		if(head == null){
			System.out.println("List is Empty");
		}else if(head.next == null){
			head = null;
		}else{
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}	
	}
		
	void deleteNode(int key) {
		if(head == null){
			System.out.println("List is Empty");
		}else{
			if(head.data == key) {
				deleteFirst();
			}else{
				Node temp = head;
				Node prev = null;

				while(temp != null && temp.data != key) {
					prev = temp;
					temp = temp.next;
				}
				if(temp == null){
					System.out.println("Data Not Found");
					return;
				}
				prev.next = temp.next;
			}	
		}
	}

	void deleteAtPos(int pos){
		if(head == null){
			System.out.println("List is Empty");
		}else{
			if(pos == 1) {
				deleteFirst();
			}else{
				Node temp = head;
				for(int i=1;temp != null && i< pos-1;i++)				{
					temp = temp.next;
				}
			
				if(temp == null || temp.next == null){
				
					return;
				}
			
				Node next = temp.next.next;
				temp.next = next;

			}
		}

	}

	int countNode()	{
		Node temp = head;
		int count = 0;
		if(temp == null){
			return count;
		}
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
		

	}

	int countNodeR(Node temp){
		if(temp == null){
			return 0;
		}

		return 1 + countNodeR(temp.next);
	}

	boolean search(int data){
		if(head == null){
			System.out.println("List is Empty");
		}else{
			Node temp = head;
			while(temp != null){
				if(data == temp.data)
					return true;
				temp = temp.next;
			}
		}
		return false;
	}
	void display() {
		Node temp = head;
		if(temp == null){
			System.out.println("List is Empty");
		
		}else {
			System.out.print("[ ");
			while(temp.next != null) {
				System.out.print(temp.data+" --> ");
				temp = temp.next;
			}
			System.out.println(temp.data+" ]");
		}

	}
	
	// Inplace Reverse Linked List                
	void inplaceReverse(){
		if(head == null){
			System.out.println("Empty ..!");
			return;
		}
		
		Node prev = null;
		Node current = head;
		Node next = null;

		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		head = prev;
	
	}

	
	// find the middle Element of Linked List
	// Two pointer approach
	// slow and fast Pointer approach
	
	void middleNode(){

		if(head == null){
			System.out.println("Empty");
			
		}else{
			Node slow = head;
		        Node fast = head;
		
			while(fast.next != null && fast.next.next != null){
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println(slow.data);	
		}
	}
	boolean detectLoop(Node head) {
		Node slow = head;
		Node fast = head;

		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast )
				return true;
		}
		return false;
	}
		
	
		
	public static void main(String [] args) {
		
		NodeDemo1 ll = new NodeDemo1();
		System.out.println(ll.search(90));
		System.out.println(ll.countNode());
		System.out.println(ll.countNodeR(ll.head));
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.addLast(40);
		ll.addAtPos(50,5);
		ll.addAtPos(60,6);
		ll.addAtPos(70,7);
		ll.addAtPos(5,1);
		ll.addLast(80);
		ll.addLast(90);
		
		ll.display();
		System.out.println(ll.search(90));
		System.out.println(ll.search(100));

		System.out.println(ll.countNode());
		System.out.println(ll.countNodeR(ll.head));

		ll.deleteFirst();
		
		ll.display();
		
		ll.deleteNode(10);
		
		ll.display();
		
		ll.deleteNode(100);
		
		ll.display();
		ll.deleteNode(90);
		
		ll.display();              
		
		ll.deleteNode(50);
		
		ll.display();
		ll.deleteAtPos(1);
		ll.display();
		ll.deleteAtPos(3);
		ll.display();
		ll.deleteAtPos(5);
		ll.display();
		ll.deleteAtPos(4);
		ll.display();
		System.out.println(ll.countNode());
		System.out.println(ll.countNodeR(ll.head));
		ll.inplaceReverse();
		ll.display();
		ll.middleNode();
		ll.addFirst(90);
		ll.display();
		ll.middleNode();

		System.out.println(ll.detectLoop(ll.head));

		ll.addLast(100);
		ll.display();
		System.out.println(ll.detectLoop(ll.head));
		ll.middleNode();


	}
}