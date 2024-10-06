package linkedlist.singlyll;

public class LinkedListDemo {
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

    static void display(Node head) {
		if(head == null){
			System.out.println("List is Empty");
		
		}else {
			System.out.print("[ ");
			while(head.next != null) {
				System.out.print(head.data+" --> ");
				head = head.next;
			}
			System.out.println(head.data+" ]");
		}

	}
}
