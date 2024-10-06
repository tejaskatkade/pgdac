package linkedlist;

public class NodeDemo{

    // head pointer refer to first node of linked list
    Node head;

    // Node Structure
    static class Node {
        int data; 
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node createNode(int data){
        return new Node(data);
    }

    public void addAtFirst(int data){
        Node newNode = createNode(data);
        newNode.next = head;
        head = newNode;
    }


    public void addAtPos(int pos,int data) {
        Node newNode = createNode(data);
        Node temp = head;

        while (pos - 2 == 0) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

}
