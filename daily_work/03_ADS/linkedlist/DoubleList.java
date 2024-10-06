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

	public static void main(String [] args) {
		DoubleList dl = new DoubleList();
		dl.addFirst(30);
		dl.addFirst(20);
		dl.addFirst(10);
		dl.display();
	}

}