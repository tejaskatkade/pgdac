
class DoubleList{
	Node head;
	class Node{
		Node prev;
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = this.prev = null;
		}

		
	}

	Node createNode(int data) {
		return new Node(data);
	}

	void addFirst(int data){
		Node newNode = createNode(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			
		}
		
	}
	void display() {
		Node temp = head;
		if(temp == null){
			System.out.println("List is Empty");
		
		}else {
			System.out.println("Forward Direction");
			System.out.print("[ ");
			while(temp.next != null) {
				System.out.print(temp.data+" --> ");
				temp = temp.next;
			}

			System.out.println(temp.data+" ]");
		
			System.out.println("BackWord Direction");

			System.out.print("[ ");
			while(temp.prev != null) {
				System.out.print(temp.data+" --> ");
				temp = temp.prev;
			}
			System.out.println(temp.data+" ]");

		}

	}
	
	void insertAfter(Node prevNode, int data) {
		if(prevNode == null) {
			System.out.println("Node not exist .");
			return;
		}
		
                Node newNode = createNode(data);

		// way 1

		//newNode.next = prevNode.next;
		//newNode.next.prev = newNode;
		//prevNode.next = newNode;
		//newNode.prev = prevNode;

		// way 2
		// handling the last node(addLast)

		if(prevNode.next != null){
			newNode.next = prevNode.next;
			newNode.next.prev = newNode;
		}			
		prevNode.next = newNode;
		newNode.prev = prevNode;

	}
		
	void addLast(int data){
		Node temp = head;
		Node newNode = createNode(data);
		if(temp == null){       
			head = newNode;
		}else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}	

	}

	void deleteNode(Node node){
		if(head == null || node == null) {
			System.out.println("Either node or List is Empty");
		}else{
			// If only one node which is head only
			if(head.next == null && head == node ) {
				head = null;
			// Deleting first(head) node
			}else if(head == node){
				head = head.next;
				head.prev = null;
			}else{
				Node temp = head;
				while(temp.next != node && temp.next != null) {
					temp = temp.next;
				}
				if(temp.next != null){
					temp.next = temp.next.next;
					if(temp.next != null)
						temp.next.prev = temp;
				}else{
					System.out.println("Node not found");
				}
			
			}		
		}
	}

	public static void main(String [] args) {
		DoubleList dl = new DoubleList();
		dl.addFirst(30);
		dl.addFirst(20);
		dl.addFirst(10);
	
		dl.insertAfter(dl.head.next.next,40);
		dl.display();

		dl.deleteNode(dl.head);
		dl.display();

		dl.insertAfter(dl.head,15);
		dl.display();
		System.out.println(dl.head.next.next.data);
		dl.deleteNode(dl.head.next.next);
		dl.display();

		dl.addLast(50);
		dl.display();

		dl.deleteNode(dl.head.next.next.next);
		dl.display();

		

	}

}