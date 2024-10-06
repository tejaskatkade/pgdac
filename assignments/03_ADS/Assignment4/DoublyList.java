// Implement a doubly linked list with insert, delete, and traverse operations

public class DoublyList {
    
    Node head;

    static class Node {
        Node prev;
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public Node createNOde(int data) {
        return new Node(data);
    }

    public void insert(int data) {
        Node newNode = createNOde(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode; 
        newNode.prev = temp;

    }

    public void travese() {
        if(head == null) {
            return; 
        }
        Node temp = head;
        System.err.print("[ ");
        while (temp.next != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.err.println(temp.data+"]");
    }

    public void delete(int key) {
        if(head == null) {
            return;
        }

        Node temp = head;
        if(temp.data == key) {
            head = head.next;
            head.prev = null;
        }

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if(temp.next != null) {
            temp.next = temp.next.next;
            if(temp.next != null) {
                temp.next.prev = temp;
            }
        }
    }
    public static void main(String[] args) {
        DoublyList dl = new DoublyList();
        dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(40);
        dl.delete(30);
        dl.travese();

    }
}
