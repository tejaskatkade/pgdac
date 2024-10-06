
public class LinkedListDemo{

    public Node head;
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node createNode(int data) {
        return new Node(data);
    }

    public void addFirst(int data) {
        Node newNode = createNode(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void insert(int data) {
        Node newNode = createNode(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp= temp.next;
        }
        temp.next = newNode;
    }
    
    public void delete(int data) {
        if(head.next == null && head.data == data) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp= temp.next;
        }
        
        if(temp.next != null) {
            if(temp.next.next == null){
                temp.next = null;
            }else{
                temp.next = temp.next.next;
            }
        }
    }
    public boolean search(int data) {
        if(head.next == null && head.data == data) {
            return true;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp= temp.next;
        }
        
        if(temp.next != null) {
            return temp.next.data == data; 
        }
        return false;
    }

    public void deleteNode(Node node) {
        Node temp = head;
        while (temp != null && temp.next != node) {
            temp = temp.next;
        }
        if(temp !=  null) {
            if(temp.next.next == null)
                temp.next = null;
            else    
                temp.next = temp.next.next;
        }
    }

    public void print(Node head) {
        if(head == null)
            return;
        Node temp = head;
        System.out.print("[");
        while (temp.next != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data+"]");
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }



}